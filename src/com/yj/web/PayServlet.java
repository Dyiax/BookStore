package com.yj.web;

import com.yj.utils.PaymentUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//
// Servlet 负责准备在线支付所需的数据，包括为安全性生成 HMAC，然后将请求转发到一个 JSP 页面，在该页面用户可以确认并完成支付。
//         该 Servlet 与 JSP 页面之间的交互对于在 Web 应用程序上创建无缝支付体验至关重要。
public class PayServlet extends BaseServlet{
    protected void pay(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ordernum=request.getParameter("ordernum");
        String money=request.getParameter("money");
        String pd_FrpId=request.getParameter("pd_FrpId");
        String p0_Cmd = "Buy";
        String p1_MerId = "10001126856";
        String p2_Order = ordernum;
        String p3_Amt = money;
        String p4_Cur = "CNY";
        String p5_Pid = "books";  //商品名称
        String p6_Pcat = "unknown";
        String p7_Pdesc = "descrition";
        String p8_Url = "http://localhost:8080/pages/cart/checkout.jsp";
        String p9_SAF = "1";
        String pa_MP = "unknown";
        String pr_NeedResponse="1";
        String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, "69cl522AV6q613Ii4W6u8K6XuW8vM1N6bFgyv769220IuYe9u37N4y7rI4Pl");

        request.setAttribute("p0_Cmd",p0_Cmd );
        request.setAttribute("p1_MerId",p1_MerId );
        request.setAttribute("p2_Order", p2_Order);
        request.setAttribute("p3_Amt", p3_Amt);
        request.setAttribute("p4_Cur",p4_Cur );
        request.setAttribute("p5_Pid",p5_Pid );
        request.setAttribute("p6_Pcat",p6_Pcat );
        request.setAttribute("p7_Pdesc",p7_Pdesc );
        request.setAttribute("p8_Url",p8_Url );
        request.setAttribute("pa_MP",pa_MP );
        request.setAttribute("pr_NeedResponse",pr_NeedResponse );
        request.setAttribute("hmac",hmac );
        request.setAttribute("p9_SAF",p9_SAF );
        request.setAttribute("pd_FrpId", pd_FrpId);

        request.getRequestDispatcher("/sure.jsp").forward(request, response);

    }
}

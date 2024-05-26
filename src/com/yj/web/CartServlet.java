package com.yj.web;

import com.google.gson.Gson;
import com.yj.bean.Book;
import com.yj.bean.Cart;
import com.yj.bean.CartItem;
import com.yj.service.BookService;
import com.yj.service.impl.BookServiceImpl;
import com.yj.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//负责处理购物车相关的操作，包括添加商品、删除商品、清空购物车、修改商品数量等。
// 这些操作都是通过操作购物车对象实现的，购物车对象的状态被存储在用户的 session 中，以便跨请求保持购物车的状态。
public class CartServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    protected void ajaxAddItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        Book book = bookService.queryBookById(id);
        CartItem cartItem = new CartItem(book.getId(),book.getName(),1,book.getPrice(),book.getPrice());
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart==null) {
            cart = new Cart();
            req.getSession().setAttribute("cart",cart);
        }
        cart.addItem(cartItem);
        req.getSession().setAttribute("lastName",cartItem.getName());

        //返回购物车总数量和最后一个商品的名称
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("totalCount",cart.getTotalCount());
        resultMap.put("lastName",cartItem.getName());
        Gson gson = new Gson();
        String resultMapJsonString = gson.toJson(resultMap);
        resp.getWriter().write(resultMapJsonString);

    }
    /**
     * 加入购物车
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id = WebUtils.parseInt(req.getParameter("id"),0);
       Book book = bookService.queryBookById(id);
       CartItem cartItem = new CartItem(book.getId(),book.getName(),1,book.getPrice(),book.getPrice());
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart==null) {
            cart = new Cart();
            req.getSession().setAttribute("cart",cart);
        }
        cart.addItem(cartItem);
        req.getSession().setAttribute("lastName",cartItem.getName());
        resp.sendRedirect(req.getHeader("Referer"));
    }

    /**
     * 删除商品项
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart!=null) {
            cart.deleteItem(id);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    /**
     * 清空商品项
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void clearItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getSession().removeAttribute("cart");
        resp.sendRedirect(req.getHeader("Referer"));
    }

    /**
     * 修改商品数量
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        int count = WebUtils.parseInt(req.getParameter("count"),1);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart!=null) {
            cart.updateCount(id,count);
            resp.sendRedirect(req.getHeader("Referer"));
        }

    }

}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-02 02:09:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createExistingReminder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fcssClass;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fcssClass.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns:th=\"http://www.thymeleaf.org\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<META HTTP-EQUIV=\"PRAGMA\" CONTENT=\"NO-CACHE\"> \n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div align=\"center\">\n");
      out.write("<a href=\"/LifeWisely/welcome\">\n");
      out.write("<img align=\"middle\" style=\"width: auto; height: auto;max-width: 200px;max-height: 200px\" src=\"http://www.colorado.edu/libraries/profiles/express/themes/expressbase/images/cu-logo.svg\">\n");
      out.write("</a>\n");
      out.write("<h2 >LifeWisely</h2>\n");
      out.write("<h6 style=\"color:#DAA520\">Manage things that matter, better</h6>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fcssClass.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/createExistingReminder.jsp(24,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setName("createReminder");
    // /WEB-INF/views/createExistingReminder.jsp(24,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/views/createExistingReminder.jsp(24,2) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCssClass("form-horizontal");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t\t<div align=\"center\">\n");
          out.write("\t\t\t<table>\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"Owner\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purpose}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t<td>Title</td>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<td><input class=\"col-sm-8 control-label\" type=\"text\" name=\"Title\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t<td>Description</td>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<td><input class=\"col-sm-8 control-label\" type=\"text\" name=\"Name\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>Category</td>\n");
          out.write("\t\t\t\t\t<td><select name=\"Category\">\n");
          out.write("  <option value=\"health-Drink water\">Drink water</option>\n");
          out.write("  <option value=\"hygiene-Cut nails\">Cut nails</option>\n");
          out.write("</select>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>Frequency</td>\n");
          out.write("\t\t\t\t\t<td><select name=\"Frequency\">\n");
          out.write("  <option value=\"0.5\">30 mins</option>\n");
          out.write("  <option value=\"1\">1 hour</option>\n");
          out.write("  <option value=\"12\">12 hours</option>\n");
          out.write("</select>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>StartTime</td>\n");
          out.write("\t\t\t\t\t<td><input class=\"col-sm-8 control-label\" type=\"datetime-local\" name=\"StartTime\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>EndTime</td>\n");
          out.write("\t\t\t\t\t<td><input class=\"col-sm-8 control-label\" type=\"datetime-local\" name=\"EndTime\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>NotifMode</td>\n");
          out.write("\t\t\t\t\t<td><select name=\"NotifMode\">\n");
          out.write("\t\t\t\t\t<option value=\"Email\">Email</option>\n");
          out.write("\t\t\t\t\t</select></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>RewardPoints</td>\n");
          out.write("\t\t\t\t\t<td><input class=\"col-sm-8 control-label\" type=\"number\" name=\"RewardPoints\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td></td>\n");
          out.write("\t\t\t\t\t<td><input class=\"btn btn-primary\" type=\"submit\" value=\"Submit\" /></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t</table>\n");
          out.write("\t\t\t<div style=\"color: red\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\n");
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fcssClass.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
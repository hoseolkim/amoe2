package kr.or.ddit.servlet01;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imageForm.do")
public class ImageFormServlet extends HttpServlet{
   
   private File imageFolder;
   private ServletContext application;
   
   @Override
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
      application = getServletContext();
      String value = application.getInitParameter("imageFolder");
      imageFolder = new File(value);
   }
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      File imageFolder = new File("D:/01.medias/images");
      
//      System.out.println("진입점");
      String[] imageFileNames = imageFolder.list((dir,name)->{
//         System.out.println(name);
         String mime = application.getMimeType(name);
         if(mime==null||mime.equals("")) return false;
//         System.out.println(mime);
         String mainType = mime.split("/")[0];
//         System.out.println(mainType);
         return "image".equals(mainType);
      });
//      System.out.println("탈출점");
      
      
      resp.setContentType("text/html; charset=utf-8");
      
      StringBuilder content = new StringBuilder();
      
      content.append("<html><body><form id='f1' method='get' onsubmit='submitHandler(event);'");
      content.append(String.format("action='%s/image.do'>", req.getContextPath()));
      content.append("<select id='picker' onchange='this.form.requestSubmit();' name='image'>");
      // <select >
      content.append("<option readonly>이미지를 선택해주세요</option>");
      for(String imageName : imageFileNames) {
         File f = new File(imageFolder,imageName);
         if(f.exists()) {
            content.append(MessageFormat.format("<option value={0}>{1}</option>", imageName,imageName));
//            content.append("<option");
//            content.append(" value='");
//            content.append(imageName);
//            content.append("'>");
//            content.append(imageName);
//            content.append("</option>");
         }
      }
      
      content.append("</select><input type='submit' value='요청하기'></form></body>");
      content.append("<script>");
      content.append("function submitHandler(event) { ");
      content.append("   event.preventDefault();");
      content.append("   var oldImg = document.getElementById('so-img');");
      content.append("   if(oldImg!=null){oldImg.remove();}");
      content.append("   let picker  = document.getElementById('picker');");
      content.append("   let value = (picker.options[picker.selectedIndex].value);");
      content.append("   var x = document.createElement('img');");
      content.append("   x.setAttribute('src','./image.do?image='+value);");
      content.append("   x.setAttribute('id','so-img');");
      content.append("   document.body.appendChild(x)");
      content.append("}");
      content.append("</script></html>");
      PrintWriter out = resp.getWriter();
      out.println(content);
      out.close();
      
   }
}
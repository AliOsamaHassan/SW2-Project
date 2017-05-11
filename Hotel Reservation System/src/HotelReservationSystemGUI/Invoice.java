import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.FdfWriter;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.itextpdf.text.PDFPTable;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
 import java.util.Enumeration;
import java.util.Locale;
import java.util.Vector;






public class Invoice {
    

    private String invoiceNumber;

    private double invoiceTotal;

  /*  private Date invoiceDate;

    public String getInvoiceNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date getInvoiceDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getInvoiceTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double setInvoiceTotal(double invoiceTotal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/

    public void printInvoice() throws FileNotFoundException {
        Document document=new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Invoice.pdf"));
            document.open();
           // document.add( new Paragraph(""),FontFactory.getFont(FontFactory.COURIER , 14, Font.BOLD, new CMYKColor(0, 255, 0, 0)));
           
            Anchor anchorTarget = new Anchor("First page of the document.");
            anchorTarget.setName("BackToTop");
            Paragraph paragraph1 = new Paragraph();
 
            paragraph1.setSpacingBefore(50);
 
            paragraph1.add(anchorTarget);
            document.add(paragraph1);
            document.close();
 

          
           // document.add( new Paragraph(""),FontFactory.getFont(FontFactory.COURIER , 14, Font.BOLD, new CMYKColor(0, 255, 0, 0)));
           
            
         
 
            
     // document.add(new Paragraph("Some more text on the \ first page with different color and font type.", FontFactory.getFont(FontFactory.COURIER , 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));

            
        } catch (DocumentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}

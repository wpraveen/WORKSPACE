/******************************************************************************/
/* FILE HEADER */
/******************************************************************************/
/*                                                                            */
/* FileName : CreatePDF.java */
/*                                                                            */
/* Author : k_praveen, THBS */
/*                                                                            */
/* Date : Mar 4, 2009 */
/*                                                                            */
/* Description : <Class Description> */
/*                                                                            */
/*                                                                            */
/******************************************************************************/
package nonweb.utils;

import java.awt.Color;
import java.io.FileOutputStream;

import com.lowagie.text.Chapter;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.List;
import com.lowagie.text.ListItem;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Section;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class CreatePDF
{
    public static void main(String[] args)
    {
        try
        {
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            PdfWriter writer =
                PdfWriter.getInstance(document, new FileOutputStream(
                    "c:/hurray.pdf"));
            document.open();
            document.add(new Paragraph("This PDF created by gr8 praveen."));
            document
                    .add(new Paragraph(
                        "Some more text on the first page with different color and font type.",
                        FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD,
                            new Color(255, 0, 0))));
            Paragraph title1 =
                new Paragraph("Chapter 1", FontFactory.getFont(
                    FontFactory.HELVETICA, 18, Font.BOLDITALIC, new Color(0, 0,
                        255)));
            Chapter chapter1 = new Chapter(title1, 1);
            chapter1.setNumberDepth(0);
            Paragraph title11 =
                new Paragraph("This is Section 1 in Chapter 1", FontFactory
                        .getFont(FontFactory.HELVETICA, 16, Font.BOLD,
                            new Color(255, 0, 0)));
            Section section1 = chapter1.addSection(title11);
            Paragraph someSectionText =
                new Paragraph(
                    "This text comes as part of section 1 of chapter 1.");
            section1.add(someSectionText);
            someSectionText = new Paragraph("Following is a 3 X 2 table.");
            section1.add(someSectionText);
            Table t = new Table(3, 2);
            t.setBorderColor(new Color(220, 255, 100));
            t.setPadding(5);
            t.setSpacing(5);
            t.setBorderWidth(1);
            //Cell c1 = new Cell("header1");
            t.addCell("header1");
            t.addCell("header2");
            t.addCell("header3");
            
            for(int i =0;i<9;i++)
            {
                t.addCell(""+(i+1));
            }
            section1.add(t);
            List l = new List(true, true, 10);
            l.add(new ListItem("First item of list"));
            l.add(new ListItem("Second item of list"));
            section1.add(l);
            document.add(chapter1);
            document.close();
        }
        catch (Exception e2)
        {
            System.out.println(e2.getMessage());
        }
    }
}

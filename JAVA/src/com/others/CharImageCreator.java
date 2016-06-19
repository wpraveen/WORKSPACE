/******************************************************************************/
/*                             FILE HEADER                                    */
/******************************************************************************/
/*                                                                            */
/*  FileName    : CharImageCreator.java                                                */
/*                                                                            */
/*  Author      : k_praveen, THBS                                               */
/*                                                                            */
/*  Date        : Sep 16, 2008                                                     */
/*                                                                            */
/*  Description : <Class Description>                                         */
/*                                                                            */
/*                                                                            */
/******************************************************************************/
package com.utils;

import java.awt.Color;
import java.io.File;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class CharImageCreator
{
    public static void main(String[] args)
    {
        final double[][] data = new double[][]{
            {210, 300, 320, 265, 299},
            {100, 304, 201, 201, 340}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "Team ", "", data);

        JFreeChart chart = null;
        BarRenderer renderer3D = null;
        CategoryPlot plot = null;


        final CategoryAxis3D categoryAxis = new CategoryAxis3D("Match");
        final ValueAxis valueAxis = new NumberAxis3D("Run");
        renderer3D = new BarRenderer3D();

        plot = new CategoryPlot(dataset, categoryAxis, valueAxis, renderer3D);
        plot.setOrientation(PlotOrientation.VERTICAL);
        chart = new JFreeChart("Srore Bord", JFreeChart.DEFAULT_TITLE_FONT, 
        plot, true);

        chart.setBackgroundPaint(new Color(249, 231, 236));

        try {
            final ChartRenderingInfo info = new ChartRenderingInfo
            (new StandardEntityCollection());

            final File file1 = new File("e:/3dbarchart.jpg");
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

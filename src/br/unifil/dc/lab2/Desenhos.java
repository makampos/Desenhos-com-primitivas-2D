package br.unifil.dc.lab2;


import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.geom.*;


/**
 * Write a description of class Desenhos here.
 * 
 * @author (Matheus de campos)
 * @version
 */
public class Desenhos {
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {

        //throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }

    public static void desenharAsterisco(Graphics2D pincel, Dimension dim) {
        //throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
        float[] dashes = {1};
        pincel.setStroke(new BasicStroke(30, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 1));// arredonda as bordas

        pincel.drawLine(50, 40, 150, 140);
        pincel.drawLine(150, 40, 50, 140);
        pincel.drawLine(30, 87, 170, 87);
        pincel.drawLine(100, 20, 100, 150);

    }

    public static void desenharSmiles(Graphics2D pincel, Dimension dim) {
        //throw new UnsupportedOperationException("O aluno ainda não implementou este método.");

        //
        /**
         * Happy smile
         */
        pincel.setStroke(new BasicStroke(8));
        pincel.drawOval(50, 150, 180, 180);

        pincel.setColor(Color.GREEN);
        pincel.fillOval(50, 150, 180, 180);

        pincel.setColor(Color.BLACK);
        pincel.fillOval(80, 215, 120, 100);

        pincel.setColor(Color.GREEN);
        pincel.fillRect(80, 190, 125, 60);

        pincel.setColor(Color.BLACK);
        pincel.fillOval(90, 190, 40, 40);
        pincel.fillOval(160, 190, 40, 40);

        /**
         *  Frustrated smile
         *
         */

        pincel.setColor(Color.BLACK);
        pincel.setStroke(new BasicStroke(8));
        pincel.drawOval(315, 150, 180, 180);
        pincel.setColor(Color.YELLOW);
        pincel.fillOval(315, 150, 180, 180);

        pincel.setColor(Color.BLACK);
        pincel.fillOval(420, 190, 40, 40);
        pincel.fillOval(350, 190, 40, 40);
        pincel.fillRect(345, 265, 125, 5);

        /**
         * Angry smile
         */

        pincel.setColor(Color.BLACK);
        pincel.setStroke(new BasicStroke(8));

        pincel.drawOval(570, 150, 180, 180);
        pincel.setColor(Color.RED);
        pincel.fillOval(570, 150, 180, 180);

        pincel.setColor(Color.BLACK);
        pincel.fillOval(605, 190, 40, 40);
        pincel.fillOval(680, 190, 40, 40);
        pincel.drawRoundRect(608, 245, 105, 65, 170, 170);
        pincel.drawLine(610, 175, 658, 190);
        pincel.drawLine(710, 175, 660, 190);
        pincel.setColor(Color.RED);
        pincel.fillRect(602, 274, 118, 35);
        pincel.fillRect(628, 290, 60, 35);

    }

    public static void desenharComputador(Graphics2D pincel, Dimension dim) {

        //monitor
        pincel.drawRect(210, 210, 220, 140);
        pincel.drawRect(220, 220, 200, 120);
        //base
        pincel.drawRect(300, 350, 50, 35);
        pincel.drawRect(265, 385, 120, 15);
        //botões monitor
        float[] dashes = {5};
        pincel.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 12, dashes, 5));
        pincel.drawLine(370, 345, 415, 345);
        //gabinete
        pincel.setStroke(new BasicStroke(1));
        pincel.drawRect(500, 200, 100, 215);
        //baias
        pincel.drawRect(507, 210, 85, 20);
        pincel.drawRect(507, 240, 85, 20);
        pincel.drawRect(507, 270, 85, 20);
        //p2
        pincel.drawOval(520, 300, 3, 3);
        pincel.drawOval(530, 300, 3, 3);
        //usb
        pincel.drawRect(550, 300, 10, 5);
        pincel.drawRect(570, 300, 10, 5);
        //disquete
        pincel.fillRect(507, 320, 50, 3);
        pincel.fillOval(527, 317, 7, 7);
        pincel.fillRect(507, 337, 50, 3);
        pincel.fillOval(527, 334, 7, 7);
        //power
        pincel.setStroke(new BasicStroke(1));
        pincel.drawOval(545, 365, 10, 10);
        // marca pc
        pincel.setFont(new Font("Serif", Font.ITALIC, 10));
        pincel.drawString("AlunoTEC ", 530, 405);

    }

    public static void desenharBandeira(Graphics2D pincel, Dimension dim) {


        pincel.setColor(new Color(0, 156, 59));
        pincel.fillRect(0, 0, Math.round(800 / 800.0f * dim.width), Math.round(600 / 600.0f * dim.height));
        pincel.setColor(new Color(255, 223, 0));

        //losango da bandeira
        int[] xValues1 = {Math.round(400 / 800.0f * dim.width), Math.round(750 / 800.0f * dim.width),
                Math.round(400 / 800.0f * dim.width), Math.round(50 / 800.0f * dim.width)};

        int[] yValues2 = {Math.round(50 / 600.0f * dim.height), Math.round(300 / 600.0f * dim.height),
                Math.round(550 / 600.0f * dim.height), Math.round(300 / 600.0f * dim.height)};
        pincel.fillPolygon(xValues1, yValues2, 4);

        //oval da bandeira
        pincel.setColor(new Color(0, 39, 118));
        pincel.fillOval(Math.round(235 / 800.0f * dim.width), Math.round(135 / 600.0f * dim.height),
                Math.round(325 / 800.0f * dim.width), Math.round(325 / 600.0f * dim.height));

        //faixa branca
        pincel.setColor(Color.white);
        pincel.setStroke(new BasicStroke(Math.round(25.0f / 800.0f * dim.width)));
        pincel.setStroke(new BasicStroke(Math.round(25.0f / 600.0f * dim.height)));

        QuadCurve2D q = new QuadCurve2D.Double();

        q.setCurve(Math.round(190 / 800.0f * dim.width), Math.round(300 / 600.0f * dim.height),
                Math.round(230 / 800.0f * dim.width), Math.round(180 / 600.0f * dim.height), Math.round(555 / 800.0f * dim.width),
                Math.round(300 / 600.0f * dim.height));
        pincel.draw(q);


        // ORDEM E PROGRESSO
       /* pincel.setColor(new Color(0,156,59));
        pincel.setFont(new Font("Serif", Font.BOLD ,12));
        pincel.setFont((new FontUIResource(Font.SANS_SERIF,10,20)));
        pincel.drawString("ORDEM E PROGRESSO",275.0f,230);*/


        //*
        pincel.setColor(new Color(255, 223, 0));
        pincel.fillRect(Math.round(560 / 800.0f * dim.width), Math.round(290 / 600.0f * dim.height),
                Math.round(80 / 800.0f * dim.width), Math.round(80 / 600.0f * dim.height));

        pincel.fillRect(Math.round(172 / 800.0f * dim.width), Math.round(230 / 600.0f * dim.height),
                Math.round(63 / 800.0f * dim.width), Math.round(90 / 600.f * dim.height));
        pincel.fillRect(Math.round(182 / 800.0f * dim.width), Math.round(223 / 600.0f * dim.height),
                Math.round(60 / 800.0f * dim.width), Math.round(40 / 600.0f * dim.height));


        // estrela

           /* int[] hValues = {200, 210, 230, 215, 220, 200, 180, 185, 170, 190};
            int[] jValues = {20, 45, 45, 55, 75, 60, 75, 55, 45, 45};
            pincel.setColor(Color.BLACK);
            Polygon star = new Polygon(hValues, jValues, 10);
            pincel.fillPolygon(star);*/

    }

    public static void desenharPredios(Graphics2D pincel, Dimension dim) {


            int qtd_andares = 0;
             qtd_andares = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de andares do prédio ? "));

            if (qtd_andares == 8) {

                // predio1
                // fundo
                pincel.setColor(Color.white);
                pincel.fillRect(0, 0, 800, 600);

                //rua
                pincel.setColor(Color.GRAY);
                pincel.fillRect(0, 550, 800, 50);

                pincel.setColor(Color.white);
                float[] dashes = {15};
                pincel.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 20, dashes, 0));// arredonda as bordas
                pincel.drawLine(10, 570, 780, 570);

                // Estrutura
                pincel.setStroke(new BasicStroke(1));
                pincel.setColor(Color.black);

                pincel.drawRect(50, 50, 200, 500);

                // janelas

                pincel.fillRect(60, 60, 85, 35);
                pincel.fillRect(60, 120, 90, 35);
                pincel.fillRect(60, 180, 90, 35);
                pincel.fillRect(60, 240, 90, 35);
                pincel.fillRect(60, 300, 90, 35);
                pincel.fillRect(60, 360, 90, 35);
                pincel.fillRect(60, 420, 90, 35);
                pincel.fillRect(60, 480, 90, 35);

                pincel.fillRect(155, 60, 85, 35);
                pincel.fillRect(155, 120, 85, 35);
                pincel.fillRect(155, 180, 85, 35);
                pincel.fillRect(155, 240, 85, 35);
                pincel.fillRect(155, 300, 85, 35);
                pincel.fillRect(155, 360, 85, 35);
                pincel.fillRect(155, 420, 85, 35);
                pincel.fillRect(155, 480, 85, 35);

                // predio 2


            } else {
                JOptionPane.showMessageDialog(null, "Não será possível construir prédios");
                pincel.setColor(Color.white);
                pincel.fillRect(0, 0, 800, 600);
            }
        }
    }



    


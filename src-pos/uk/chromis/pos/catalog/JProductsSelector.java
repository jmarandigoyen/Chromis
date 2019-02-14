/*
**    Chromis POS  - The New Face of Open Source POS
**    Copyright (c)2015-2016
**    http://www.chromis.co.uk
**
**    This file is part of Chromis POS Version V0.60.2 beta
**
**    Chromis POS is free software: you can redistribute it and/or modify
**    it under the terms of the GNU General Public License as published by
**    the Free Software Foundation, either version 3 of the License, or
**    (at your option) any later version.
**
**    Chromis POS is distributed in the hope that it will be useful,
**    but WITHOUT ANY WARRANTY; without even the implied warranty of
**    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**    GNU General Public License for more details.
**
**    You should have received a copy of the GNU General Public License
**    along with Chromis POS.  If not, see <http://www.gnu.org/licenses/>
**
**
*/

package uk.chromis.pos.catalog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import uk.chromis.beans.JFlowPanel;

/**
 *
 * @author adrianromero
 */
public class JProductsSelector extends javax.swing.JPanel {
    
    private JFlowPanel flowpanel;
   public JProductsSelector() {
        initComponents();

        flowpanel = new JFlowPanel();
        
        add(flowpanel, BorderLayout.CENTER);
    }
       
    /**
     *
     * @param img
     * @param display
     * @param al
     * @param textTip
     */
        public void addProduct(Image img, String display, ActionListener al,String textTip) {        
        JButton btn = new JButton();
        btn.applyComponentOrientation(getComponentOrientation());

        btn.setText(display);
//        btn.setText(name);
        btn.setIcon(new ImageIcon(img));
        btn.setFocusPainted(false);
        if (textTip != null){
        btn.setToolTipText(textTip);
        }
        btn.setFocusable(false);
        btn.setRequestFocusEnabled(false);
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn.setMargin(new Insets(2, 2, 2, 2));
        btn.setMaximumSize(new Dimension(80, 70));
        btn.setPreferredSize(new Dimension(80, 70));
        btn.setMinimumSize(new Dimension(80, 70));
        btn.addActionListener(al);
        flowpanel.add(btn);        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}

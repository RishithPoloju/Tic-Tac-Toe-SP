/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tictactoe;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Rishi
 */
public class TicTacToeUI extends javax.swing.JFrame
{

    /**
     * Creates new form TicTacToeUI
     */
    public int mat[][]=new int[3][3];
    public int count;
    public TicTacToeUI()
    {
        count = 1;
        initComponents();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=2;
            }
        }
    }
    public void check()
    {
        Random r=new Random();
        int k,l;
        int fla=0;
       // if(count%2==0)
        //{
        int flag=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(mat[i][j]==2)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            JOptionPane.showMessageDialog(Exit,"Match is a Draw");
            return;
           
        }
        if(mat[0][0]==1&&mat[0][1]==1&&mat[0][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][0]==1&&mat[1][1]==1&&mat[2][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][0]==1&&mat[1][0]==1&&mat[2][0]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][0]==1&&mat[0][1]==1&&mat[0][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[1][0]==1&&mat[1][1]==1&&mat[1][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[2][0]==1&&mat[2][1]==1&&mat[2][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][1]==1&&mat[1][1]==1&&mat[2][1]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][2]==1&&mat[1][2]==1&&mat[2][2]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
        }
        
        else if(mat[0][2]==1&&mat[1][1]==1&&mat[2][0]==1)
        {
            JOptionPane.showMessageDialog(Exit,"Congratulations X,You Won");
            fla=1;
            return;
            
        }
        
        
        
        
        //for O 00 01 02
        if(mat[0][0]==0&&mat[0][1]==0&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][0]==0&&mat[0][2]==0&&mat[0][1]==2)
        {
            mat[0][1]=0;
            jButton01.setText("O");
            jButton01.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][1]==0&&mat[0][2]==0&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //for O 00 11 22
        else if(mat[1][1]==0&&mat[2][2]==0&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][0]==0&&mat[2][2]==0&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][0]==0&&mat[1][1]==0&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //For O 00 10 20
        else if(mat[1][0]==0&&mat[2][0]==0&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][0]==0&&mat[2][0]==0&&mat[1][0]==2)
        {
            mat[1][0]=0;
            jButton10.setText("O");
            jButton10.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][0]==0&&mat[1][0]==0&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //For O 10 11 12
        else if(mat[1][1]==0&&mat[1][2]==0&&mat[1][0]==2)
        {
            mat[1][0]=0;
            jButton10.setText("O");
            jButton10.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[1][0]==0&&mat[1][2]==0&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[1][0]==0&&mat[1][1]==0&&mat[1][2]==2)
        {
            mat[1][2]=0;
            jButton12.setText("O");
            jButton12.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //For O 20 21 22
        else if(mat[2][1]==0&&mat[2][2]==0&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[2][0]==0&&mat[2][2]==0&&mat[2][1]==2)
        {
            mat[2][1]=0;
            jButton21.setText("O");
            jButton21.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        } 
        else if(mat[2][0]==0&&mat[2][1]==0&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //For O 01 11 21
        else if(mat[1][1]==0&&mat[2][1]==0&&mat[0][1]==2)
        {
            mat[0][1]=0;
            jButton01.setText("O");
            jButton01.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][1]==0&&mat[2][1]==0&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][1]==0&&mat[1][1]==0&&mat[2][1]==2)
        {
            mat[2][1]=0;
            jButton21.setText("O");
            jButton21.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
         //For O 02 12 22
        else if(mat[1][2]==0&&mat[2][2]==0&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][2]==0&&mat[2][2]==0&&mat[1][2]==2)
        {
            mat[1][2]=0;
            jButton12.setText("O");
            jButton12.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        } 
        else if(mat[0][2]==0&&mat[1][2]==0&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //For O 02 11 20
        else if(mat[1][1]==0&&mat[2][0]==0&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][2]==0&&mat[2][0]==0&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        else if(mat[0][2]==0&&mat[1][1]==0&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            JOptionPane.showMessageDialog(Exit,"You Loose,CPU Wins");
            fla=1;
            return;
        }
        //for X 00 01 02
        else if(mat[0][0]==1&&mat[0][1]==1&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
        }
        else if(mat[0][0]==1&&mat[0][2]==1&&mat[0][1]==2)
        {
            mat[0][1]=0;
            jButton01.setText("O");
            jButton01.setEnabled(false);
        }
        else if(mat[0][1]==1&&mat[0][2]==1&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
        }
        
        //for X 00 11 22
        else if(mat[1][1]==1&&mat[2][2]==1&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
            
        }
        else if(mat[0][0]==1&&mat[2][2]==1&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
     
        }
        else if(mat[0][0]==1&&mat[1][1]==1&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            
        }
        
        //For X 00 10 20
        else if(mat[1][0]==1&&mat[2][0]==1&&mat[0][0]==2)
        {
            mat[0][0]=0;
            jButton00.setText("O");
            jButton00.setEnabled(false);
            
        }
        else if(mat[0][0]==1&&mat[2][0]==1&&mat[1][0]==2)
        {
            mat[1][0]=0;
            jButton10.setText("O");
            jButton10.setEnabled(false);
            
        }
        else if(mat[0][0]==1&&mat[1][0]==1&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            
        }
        
        //For X 10 11 12
        else if(mat[1][1]==1&&mat[1][2]==1&&mat[1][0]==2)
        {
            mat[1][0]=0;
            jButton10.setText("O");
            jButton10.setEnabled(false);
            
        }
        else if(mat[1][0]==1&&mat[1][2]==1&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            
        }
        else if(mat[1][0]==1&&mat[1][1]==1&&mat[1][2]==2)
        {
            mat[1][2]=0;
            jButton12.setText("O");
            jButton12.setEnabled(false);
            
        }
        
        
        //For X 20 21 22
        else if(mat[2][1]==1&&mat[2][2]==1&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            
        }
        else if(mat[2][0]==1&&mat[2][2]==1&&mat[2][1]==2)
        {
            mat[2][1]=0;
            jButton21.setText("O");
            jButton21.setEnabled(false);
            
        } 
        else if(mat[2][0]==1&&mat[2][1]==1&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            
        }
        
        
        
        //For X 01 11 21
        else if(mat[1][1]==1&&mat[2][1]==1&&mat[0][1]==2)
        {
            mat[0][1]=0;
            jButton01.setText("O");
            jButton01.setEnabled(false);
            
        }
        else if(mat[0][1]==1&&mat[2][1]==1&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
            
        }
        else if(mat[0][1]==1&&mat[1][1]==1&&mat[2][1]==2)
        {
            mat[2][1]=0;
            jButton21.setText("O");
            jButton21.setEnabled(false);
            
        }
        
        
       
        //For X 02 12 22
        else if(mat[1][2]==1&&mat[2][2]==1&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
            
        }
        else if(mat[0][2]==1&&mat[2][2]==1&&mat[1][2]==2)
        {
            mat[1][2]=0;
            jButton12.setText("O");
            jButton12.setEnabled(false);
            
        } 
        else if(mat[0][2]==1&&mat[1][2]==1&&mat[2][2]==2)
        {
            mat[2][2]=0;
            jButton22.setText("O");
            jButton22.setEnabled(false);
            
        }
        
        
        //For X 02 11 20
        else if(mat[1][1]==1&&mat[2][0]==1&&mat[0][2]==2)
        {
            mat[0][2]=0;
            jButton02.setText("O");
            jButton02.setEnabled(false);
            
        }
        else if(mat[0][2]==1&&mat[2][0]==1&&mat[1][1]==2)
        {
            mat[1][1]=0;
            jButton11.setText("O");
            jButton11.setEnabled(false);
           
        }
        else if(mat[0][2]==1&&mat[1][1]==1&&mat[2][0]==2)
        {
            mat[2][0]=0;
            jButton20.setText("O");
            jButton20.setEnabled(false);
            
        }
        else
        {
            
            do
            {
                k = r.nextInt((2 - 0) + 1) + 0;
                l=r.nextInt((2 - 0) + 1) + 0;
            }while(mat[k][l]!=2);
            mat[k][l]=0;
            if(k==0&&l==0)
            {
                jButton00.setText("O");
                jButton00.setEnabled(false);
            }
            if(k==0&&l==1)
            {
                jButton01.setText("O");
                jButton01.setEnabled(false);
            }
            if(k==0&&l==2)
            {
                jButton02.setText("O");
                jButton02.setEnabled(false);
            }
            if(k==1&&l==0)
            {
                jButton10.setText("O");
                jButton10.setEnabled(false);
            }
            if(k==1&&l==1)
            {
                jButton11.setText("O");
                jButton11.setEnabled(false);
            }
            if(k==1&&l==2)
            {
                jButton12.setText("O");
                jButton12.setEnabled(false);
            }
            if(k==2&&l==0)
            {
                jButton20.setText("O");
                jButton20.setEnabled(false);
            }
            if(k==2&&l==1)
            {
                jButton21.setText("O");
                jButton21.setEnabled(false);
            }
            if(k==2&&l==2)
            {
                jButton22.setText("O");
                jButton22.setEnabled(false);
            }
            
        }
        count++;
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton00.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton00ActionPerformed(evt);
            }
        });

        jButton01.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton01ActionPerformed(evt);
            }
        });

        jButton02.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton02ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });

        jButton20.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton00, jButton01, jButton02, jButton10, jButton11, jButton12, jButton20, jButton21, jButton22});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton00, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton01, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton02, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ResetActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton00ActionPerformed
    {//GEN-HEADEREND:event_jButton00ActionPerformed
        // TODO add your handling code here:
       
        {
            jButton00.setText("X");
            mat[0][0]=1;
            count++;
            check();
        }
        
        jButton00.setEnabled(false);
    }//GEN-LAST:event_jButton00ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExitActionPerformed
    {//GEN-HEADEREND:event_ExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(Exit, "Thank You");
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton01ActionPerformed
    {//GEN-HEADEREND:event_jButton01ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton01.setText("X");
            mat[0][1]=1;
            count++;
            check();
        }
     
        
        jButton01.setEnabled(false);
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton02ActionPerformed
    {//GEN-HEADEREND:event_jButton02ActionPerformed
        // TODO add your handling code here:
       
        {
            jButton02.setText("X");
            mat[0][2]=1;
            count++;
            check();
        }
        
        
        jButton02.setEnabled(false);
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton10ActionPerformed
    {//GEN-HEADEREND:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton10.setText("X");
            mat[1][0]=1;
            count++;
            check();
        }
        
        
        jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton11ActionPerformed
    {//GEN-HEADEREND:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton11.setText("X");
            mat[1][1]=1;
            count++;
            check();
        }
       
        
        jButton11.setEnabled(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton12.setText("X");
            mat[1][2]=1;
            count++;
            check();
        }
       
        
        jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton20ActionPerformed
    {//GEN-HEADEREND:event_jButton20ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton20.setText("X");
            mat[2][0]=1;
            count++;
            check();
        }
      
        
        jButton20.setEnabled(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton21ActionPerformed
    {//GEN-HEADEREND:event_jButton21ActionPerformed
        // TODO add your handling code here:
        
        {
            jButton21.setText("X");
            mat[2][1]=1;
            count++;
            check();
        }
        
        
        jButton21.setEnabled(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton22ActionPerformed
    {//GEN-HEADEREND:event_jButton22ActionPerformed
        // TODO add your handling code here:
        
        
        {
            jButton22.setText("X");
            mat[2][2]=1;
            count++;
            check();
        }
        
        
        jButton22.setEnabled(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ResetActionPerformed
    {//GEN-HEADEREND:event_ResetActionPerformed
        // TODO add your handling code here:
        jButton00.setText("");
        jButton01.setText("");
        jButton02.setText("");
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton00.setEnabled(true);
        jButton01.setEnabled(true);
        jButton02.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=2;
            }
        }
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TicTacToeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

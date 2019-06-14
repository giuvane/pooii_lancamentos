/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.visao.swing;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import utfpr.giuvane.projetofinal.modelo.rn.ClienteRN;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;
import utfpr.giuvane.projetofinal.modelo.vo.Endereco;

/**
 *
 * @author Giuvane Conti
 */
public class CadastrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaCliente
     */
    Long idAlteracao=0L;
    ClienteRN clienteRN = new ClienteRN();
    Cliente cli = new Cliente();
    Endereco end = new Endereco();
    
    public CadastrarCliente() {
        initComponents();
    }
    
    public CadastrarCliente(Long idAlteracao) {
        initComponents();
        this.idAlteracao = idAlteracao;
        try{
            Cliente cliFind = clienteRN.listarUm(idAlteracao);
            txtID.setText(String.valueOf(cliFind.getCodigo()));
            txtNome.setText(cliFind.getNome());
            txtBairro.setText(cliFind.getEndereco().getBairro());
            txtCEP.setText(cliFind.getEndereco().getCep());
            txtCidade.setText(cliFind.getEndereco().getCidade());
            txtComplemento.setText(cliFind.getEndereco().getComplemento());
            txtEstado.setText(cliFind.getEndereco().getEstado());
            txtLogradouro.setText(cliFind.getEndereco().getLogradouro());
            txtNumero.setText(cliFind.getEndereco().getNumero());
            checkAtivo.setSelected(cliFind.getAtivo());
            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
//            String sql = "select * from Cliente where IdCliente = ? ";
//            PreparedStatement stmt = con.prepareStatement(sql);
//           //stmt.setInt(1, idAlteracao);
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                txtID.setText(rs.getString("IDCliente"));
//                txtID.setEnabled(false);
//                txtNome.setText(rs.getString("Nome"));
//                txtLogradouro.setText(rs.getString("DDD"));
//                //txtTelefone.setText(rs.getString("Telefone"));
//                txtComplemento.setText(rs.getString("Email"));
//                txtBairro.setText(rs.getString("CPF"));
//                txtCEP.setText(rs.getString("RG"));
//                java.util.Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("DtNascimento"));
//                txtCidade.setText(new SimpleDateFormat("dd/MM/yyyy").format(dt));
//            }
//            stmt.close();
//            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        checkAtivo = new javax.swing.JCheckBox();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Cliente");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(600, 400));

        txtID.setEditable(false);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogradouroActionPerformed(evt);
            }
        });

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Logradouro:");

        jLabel4.setText("Complemento:");

        jLabel5.setText("Bairro:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Cidade:");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/accept_button.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel_32.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("nº");

        jLabel9.setText("Estado:");

        jLabel10.setText("Status:");

        checkAtivo.setText("Ativo");
        checkAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkAtivo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(txtLogradouro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtivo)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        try{
            if(idAlteracao == 0){
                cli.setNome(this.txtNome.getText());
                cli.setAtivo(checkAtivo.isSelected());
                end.setBairro(txtBairro.getText());
                end.setCep(txtCEP.getText());
                end.setCidade(txtCidade.getText());
                end.setComplemento(txtComplemento.getText());
                end.setEstado(txtEstado.getText());
                end.setLogradouro(txtLogradouro.getText());
                end.setNumero(txtNumero.getText());
                cli.setEndereco(end);
                
                this.clienteRN.salvar(cli);
                
//                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/"
//                        + "test","root","admin");  
//                String sql = "insert into Cliente(Nome,Telefone,DDD,Email,CPF,RG,"
//                        + "DtNascimento) values (?,?,?,?,?,?,?)";
//                PreparedStatement stmt = con.prepareStatement(sql);
//                stmt.setString(1, this.txtNome.getText());
//                stmt.setInt(2, Integer.parseInt(this.txtTelefone.getText()));
//                stmt.setInt(3, Integer.parseInt(this.txtLogradouro.getText()));
//                stmt.setString(4, this.txtComplemento.getText());
//                stmt.setString(5, this.txtBairro.getText());
//                stmt.setString(6, this.txtCEP.getText());
//                SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd"); 
//                Date dt = new Date(df.parse(txtCidade.getText()).getTime());
//                stmt.setDate(7, dt);
//                stmt.execute();
//                stmt.close();
//                con.close();
            }else{
                Cliente cliFind = clienteRN.listarUm(idAlteracao);
                cliFind.setNome(this.txtNome.getText());
                cliFind.setAtivo(checkAtivo.isSelected());
                end.setBairro(txtBairro.getText());
                end.setCep(txtCEP.getText());
                end.setCidade(txtCidade.getText());
                end.setComplemento(txtComplemento.getText());
                end.setEstado(txtEstado.getText());
                end.setLogradouro(txtLogradouro.getText());
                end.setNumero(txtNumero.getText());
                cliFind.setEndereco(end);
                
                clienteRN.atualizar(cliFind);
                
//                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/"
//                        + "test","root","admin");  
//                String sql = "update Cliente set Nome=?,Telefone=?,DDD=?,Email=?"
//                        + ",CPF=?,RG=?,DtNascimento=? where idCliente = ?";
//                PreparedStatement stmt = con.prepareStatement(sql);
//                stmt.setString(1, this.txtNome.getText());
//                //stmt.setInt(2, Integer.parseInt(this.txtTelefone.getText()));
//                stmt.setInt(3, Integer.parseInt(this.txtLogradouro.getText()));
//                stmt.setString(4, this.txtComplemento.getText());
//                stmt.setString(5, this.txtBairro.getText());
//                stmt.setString(6, this.txtCEP.getText());
//                SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd"); 
//                Date dt = new Date(df.parse(txtCidade.getText()).getTime());
//                stmt.setDate(7, dt);
//                //stmt.setInt(8, idAlteracao);
//                stmt.execute();
//                stmt.close();
//                con.close();
            }
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso!");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void checkAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAtivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
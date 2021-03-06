/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.visao.swing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import utfpr.giuvane.projetofinal.modelo.rn.CategoriaRN;
import utfpr.giuvane.projetofinal.modelo.rn.ClienteRN;
import utfpr.giuvane.projetofinal.modelo.rn.LancamentoRN;
import utfpr.giuvane.projetofinal.modelo.vo.Categoria;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;
import utfpr.giuvane.projetofinal.modelo.vo.Lancamento;
import utfpr.giuvane.projetofinal.modelo.vo.TipoLancamento;
import utfpr.giuvane.projetofinal.util.DataUtil;

/**
 *
 * @author Giuvane Conti
 */
public class CadastrarLancamento extends javax.swing.JInternalFrame {

    private Long idAlteracao = 0L;
    private List<Categoria> categorias;
    private CategoriaRN categoriaRN;
    private List<Cliente> clientes;
    private ClienteRN clienteRN;
    private Lancamento lancamento;
    private LancamentoRN lancamentoRN;
    private Lancamento lancamentoAlteracao;
    
    public CadastrarLancamento() {
        this.categoriaRN = new CategoriaRN();
        this.clienteRN = new ClienteRN();
        this.lancamentoRN = new LancamentoRN();
        initComponents();
        this.popularComboCategoria();
        this.popularComboTipoLancamento();
        this.popularComboCliente();
    }
    
    public CadastrarLancamento(Long idAlteracao) {
        initComponents();
        this.idAlteracao = idAlteracao;
        try{
            lancamentoAlteracao = lancamentoRN.listarUm(idAlteracao);
            txtID.setText(String.valueOf(lancamentoAlteracao.getCodigo()));
            txtDescricao.setText(lancamentoAlteracao.getDescricao());
            txtObservacao.setText(lancamentoAlteracao.getObservacao());
            txtValor.setText(String.valueOf(lancamentoAlteracao.getValor()));
            
            // Converte LocalDate para Date, para popular JCalendar
            dateDtPagamento.setDate(DataUtil.converteLocalDateToDate(lancamentoAlteracao.getDataPagamento()));
            
            // Converte LocalDate para Date, para popular JCalendar
            dateDtVencimento.setDate(DataUtil.converteLocalDateToDate(lancamentoAlteracao.getDataVencimento()));
            
            popularComboClienteEdicao(idAlteracao);
            //comboCliente.setSelectedItem(lancamentoAlteracao.getCliente());
            
            popularComboCategoriaEdicao(idAlteracao);
            //comboCategoria.setSelectedItem(lancamentoAlteracao.getCategoria());
            
            popularComboTipoLancamentoEdicao(idAlteracao);
            //comboTipo.setSelectedItem(lancamentoAlteracao.getTipo());
            
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
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        comboCategoria = new javax.swing.JComboBox<String>();
        comboTipo = new javax.swing.JComboBox<String>();
        dateDtPagamento = new com.toedter.calendar.JDateChooser();
        dateDtVencimento = new com.toedter.calendar.JDateChooser();
        comboCliente = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Lançamento");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        txtID.setEditable(false);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Descricao:");

        jLabel3.setText("Data Pagamento:");

        jLabel4.setText("Data Vencimento:");

        jLabel5.setText("Valor:");

        jLabel6.setText("Categoria:");

        jLabel7.setText("Tipo:");

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

        jLabel8.setText("Cliente:");

        jLabel9.setText("Obs:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(dateDtPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateDtVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCliente, 0, 156, Short.MAX_VALUE))
                            .addComponent(txtObservacao))))
                .addContainerGap(98, Short.MAX_VALUE))
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
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dateDtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(dateDtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        try{
            if(this.idAlteracao == 0){
                lancamento = new Lancamento();
                lancamento.setCategoria((Categoria)this.getCategoriaSelecionada(comboCategoria.getSelectedIndex()));
                lancamento.setCliente((Cliente)this.getClienteSelecionado(comboCliente.getSelectedIndex()));
                lancamento.setTipo((TipoLancamento)this.getTipoLancamentoSelecionado(comboTipo.getSelectedIndex()));
                
                Calendar dataPagamentoCalendar = dateDtPagamento.getCalendar();
                LocalDate dataPagamentoLocalDate = LocalDateTime.ofInstant(dataPagamentoCalendar.toInstant(), dataPagamentoCalendar.getTimeZone().toZoneId()).toLocalDate();
                lancamento.setDataPagamento(dataPagamentoLocalDate);
                
                Calendar dataVencimentoCalendar = dateDtVencimento.getCalendar();
                LocalDate dataVencimentoLocalDate = LocalDateTime.ofInstant(dataVencimentoCalendar.toInstant(), dataVencimentoCalendar.getTimeZone().toZoneId()).toLocalDate();
                lancamento.setDataVencimento(dataVencimentoLocalDate);
                
                lancamento.setDescricao(txtDescricao.getText());
                lancamento.setObservacao(txtObservacao.getText());
                lancamento.setValor(new BigDecimal(txtValor.getText()));
                
                lancamentoRN.salvar(lancamento);
                
            }else{
                lancamentoAlteracao.setCategoria((Categoria)this.getCategoriaSelecionada(comboCategoria.getSelectedIndex()));
                lancamentoAlteracao.setCliente((Cliente)this.getClienteSelecionado(comboCliente.getSelectedIndex()));
                lancamentoAlteracao.setTipo((TipoLancamento)this.getTipoLancamentoSelecionado(comboTipo.getSelectedIndex()));
                
                Calendar dataPagamentoCalendar = dateDtPagamento.getCalendar();
                LocalDate dataPagamentoLocalDate = LocalDateTime.ofInstant(dataPagamentoCalendar.toInstant(), dataPagamentoCalendar.getTimeZone().toZoneId()).toLocalDate();
                lancamentoAlteracao.setDataPagamento(dataPagamentoLocalDate);
                
                Calendar dataVencimentoCalendar = dateDtVencimento.getCalendar();
                LocalDate dataVencimentoLocalDate = LocalDateTime.ofInstant(dataVencimentoCalendar.toInstant(), dataVencimentoCalendar.getTimeZone().toZoneId()).toLocalDate();
                lancamentoAlteracao.setDataVencimento(dataVencimentoLocalDate);
                
                lancamentoAlteracao.setDescricao(txtDescricao.getText());
                lancamentoAlteracao.setObservacao(txtObservacao.getText());
                lancamentoAlteracao.setValor(new BigDecimal(txtValor.getText()));
                
                lancamentoRN.atualizar(lancamentoAlteracao);
                
            }
            JOptionPane.showMessageDialog(this, "Lançamento cadastrado com sucesso!");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void popularComboCategoria() {
        ComboBoxModel modeloCat;
            try {
                Vector linhas = new Vector();
                categorias = categoriaRN.listaTodos();
                
                for (Categoria c : categorias)
                {
                    Vector linha = new Vector();
                    linha.add(c.getCodigo());
                    linha.add(c.getNome());
                    linhas.add(linha);
                }
                modeloCat = new DefaultComboBoxModel(linhas);
                comboCategoria.setModel(modeloCat);
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private void popularComboCategoriaEdicao(Long id) {
        ComboBoxModel modeloCat;
            try {
                Vector linhas = new Vector();
                categorias = categoriaRN.listaTodos();
                int index = 0;
                int indexSelecionado = 0;
                for (Categoria c : categorias)
                {
                    Vector linha = new Vector();
                    linha.add(c.getCodigo());
                    linha.add(c.getNome());
                    linhas.add(linha);
                    
                    if (lancamentoAlteracao.getCategoria().getCodigo().equals(c.getCodigo())) {
                        indexSelecionado = index;
                    }
                    index++;
                }
                modeloCat = new DefaultComboBoxModel(linhas);
                comboCategoria.setModel(modeloCat);
                comboCategoria.setSelectedIndex(indexSelecionado);
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private void popularComboCliente() {
        ComboBoxModel modeloCli;
            try {
                Vector linhas = new Vector();
                clientes = clienteRN.listaTodos();
                
                for (Cliente c : clientes)
                {
                    Vector linha = new Vector();
                    linha.add(c.getCodigo());
                    linha.add(c.getNome());
                    linhas.add(linha);
                }
                modeloCli = new DefaultComboBoxModel(linhas);
                comboCliente.setModel(modeloCli);
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private void popularComboClienteEdicao(Long id) {
        ComboBoxModel modeloCli;
            try {
                Vector linhas = new Vector();
                clientes = clienteRN.listaTodos();
                int index = 0;
                int indexSelecionado = 0;
                for (Cliente c : clientes)
                {
                    Vector linha = new Vector();
                    linha.add(c.getCodigo());
                    linha.add(c.getNome());
                    linhas.add(linha);
                    
                    if (lancamentoAlteracao.getCliente().getCodigo().equals(c.getCodigo())) {
                        indexSelecionado = index;
                    }
                    index++;
                }
                modeloCli = new DefaultComboBoxModel(linhas);
                comboCliente.setModel(modeloCli);
                comboCliente.setSelectedIndex(indexSelecionado);
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private void popularComboTipoLancamento() {
        ComboBoxModel modeloTipo;
            try {
                Vector linhas = new Vector();
                //categorias = categoriaRN.listaTodos();
                Vector despesa = new Vector();
                despesa.add(TipoLancamento.DESPESA);
                linhas.add(despesa);
                
                Vector receita = new Vector();
                receita.add(TipoLancamento.RECEITA);
                linhas.add(receita);
                
                modeloTipo = new DefaultComboBoxModel(linhas);
                comboTipo.setModel(modeloTipo);
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private void popularComboTipoLancamentoEdicao(Long id) {
        ComboBoxModel modeloTipo;
            try {
                Vector linhas = new Vector();
                //categorias = categoriaRN.listaTodos();
                Vector despesa = new Vector();
                despesa.add(TipoLancamento.DESPESA);
                linhas.add(despesa);
                
                Vector receita = new Vector();
                receita.add(TipoLancamento.RECEITA);
                linhas.add(receita);
                
                modeloTipo = new DefaultComboBoxModel(linhas);
                comboTipo.setModel(modeloTipo);
                if (lancamentoAlteracao.getTipo().equals(TipoLancamento.DESPESA)) {
                    comboTipo.setSelectedIndex(0);
                } else {
                    comboTipo.setSelectedIndex(1);
                }
            } catch (Exception e) {

                    e.printStackTrace();
            }
    }
    
    private Object getCategoriaSelecionada(int posicao) 
    {
        Categoria c = new Categoria();
        c = (Categoria) categorias.get(posicao);

        return c;
    }
    
    private Object getClienteSelecionado(int posicao) 
    {
        Cliente c = new Cliente();
        c = (Cliente) clientes.get(posicao);

        return c;
    }
    
    private Object getTipoLancamentoSelecionado(int posicao) 
    {
        TipoLancamento tl;
        if (comboTipo.getSelectedIndex() == 0) {
            tl = TipoLancamento.DESPESA;
        } else {
            tl = TipoLancamento.RECEITA;
        }
        
        return tl;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboTipo;
    private com.toedter.calendar.JDateChooser dateDtPagamento;
    private com.toedter.calendar.JDateChooser dateDtVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.senha;

import java.util.Random;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author T2S
 */
public class inicio extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    public String senha[] = new String[4];
    public int rodada = 0;
    public String historico = "";

    public void sortear() {
        String cor[] = new String[7];
        cor[0] = "amarelo";
        cor[1] = "azul";
        cor[2] = "verde";
        cor[3] = "vermelho";
        cor[4] = "lilas";
        cor[5] = "roxo";
        cor[6] = "marrom";
        Random gera = new Random();

        boolean diferente = false;
        int indice = 0;
        String corSorteada = "";
        for (int x = 0; x < 4; x++) {
            senha[x] = "";
        }
        while (indice < 4) {
            corSorteada = cor[gera.nextInt(7)];
            for (int x = 0; x <= indice; x++) {
                if (senha[x].equals(corSorteada)) {
                    diferente = false;
                    break;
                } else {
                    diferente = true;                    
                }
            }
            if (diferente) {
                senha[indice] = corSorteada;
                indice += 1;
            }
        }

    }
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form Homeform;
    private ImageItem BannerimageItem;
    private Form Jogoform;
    private TextField posicao2TextField;
    private TextField posicao1TextField;
    private StringItem tentativaStringItem;
    private Spacer spacer1;
    private StringItem senhaStringItem;
    private StringItem resultadoStringItem;
    private TextField posicao3TextField;
    private TextField posicao4TextField;
    private Spacer spacer;
    private StringItem opcaoStringItem;
    private Spacer spacer2;
    private StringItem alertaStringItem;
    private Form ajudaform;
    private StringItem ajudaStringItem;
    private Form historicoform;
    private StringItem historicoStringItem;
    private Command inicioCommand;
    private Command voltarJogoCommand;
    private Command ajudaCommand;
    private Command voltarAjudaCommand;
    private Command screenCommand1;
    private Command confirmarCommand;
    private Command screenCommand;
    private Command historicoCommand;
    private Command exitCommand;
    private Command novoJogoCommand;
    private Command backCommand;
    private Image image1;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The inicio constructor.
     */
    public inicio() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction

        switchDisplayable(null, getHomeform());//GEN-LINE:|3-startMIDlet|1|3-postAction
        sortear();
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == Homeform) {//GEN-BEGIN:|7-commandAction|1|30-preAction
            if (command == ajudaCommand) {//GEN-END:|7-commandAction|1|30-preAction
                // write pre-action user code here
                switchDisplayable(null, getAjudaform());//GEN-LINE:|7-commandAction|2|30-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|83-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|83-postAction
                // write post-action user code here
            } else if (command == inicioCommand) {//GEN-LINE:|7-commandAction|5|21-preAction
                // write pre-action user code here
                switchDisplayable(null, getJogoform());//GEN-LINE:|7-commandAction|6|21-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|79-preAction
        } else if (displayable == Jogoform) {
            if (command == confirmarCommand) {//GEN-END:|7-commandAction|7|79-preAction

                int acertoCor = 0;
                int acertoPosicao = 0;
                String posicao[] = new String[4];

                if (rodada <= 5) {

                    posicao[0] = posicao1TextField.getString();
                    posicao[1] = posicao2TextField.getString();
                    posicao[2] = posicao3TextField.getString();
                    posicao[3] = posicao4TextField.getString();

                    boolean valido = false;
                    if (posicao[0].equals(posicao[1]) || posicao[0].equals(posicao[2]) || posicao[0].equals(posicao[3]) || posicao[1].equals(posicao[2]) || posicao[1].equals(posicao[3]) || posicao[2].equals(posicao[3])) {
                        valido = false;
                        alertaStringItem.setText("Não repita as cores!");
                    } else {
                        for (int i = 0; i < 4; i++) {
                            if (posicao[i].equals("amarelo") || posicao[i].equals("azul") || posicao[i].equals("verde") || posicao[i].equals("vermelho") || posicao[i].equals("lilas") || posicao[i].equals("roxo") || posicao[i].equals("marrom")) {
                                valido = true;
                                alertaStringItem.setText("");
                            } else {
                                valido = false;
                                alertaStringItem.setText("Cor informada inválida!");
                                break;
                            }
                        }

                    }

                    if (valido) {
                        rodada += 1;
                        posicao1TextField.setString("");
                        posicao2TextField.setString("");
                        posicao3TextField.setString("");
                        posicao4TextField.setString("");

                        for (int x = 0; x < 4; x++) {
                            if (posicao[x].equals(senha[x])) {
                                acertoPosicao += 1;
                            }
                        }

                        for (int c = 0; c < 4; c++) {
                            if (posicao[c].equals(senha[0]) || posicao[c].equals(senha[1]) || posicao[c].equals(senha[2]) || posicao[c].equals(senha[3])) {
                                acertoCor += 1;
                            }
                        }

                        String textoCor = "cores";
                        if (acertoCor == 1){
                            textoCor = "cor";
                        }

                        String textoPosicao = "posições";
                        if (acertoPosicao == 1){
                            textoPosicao = "posição";
                        }

                        historico += "\nTentativa " + rodada + ": opções " + posicao[0] + ", " + posicao[1] + ", " + posicao[2] + ", " + posicao[3] + " - Acertou " + acertoPosicao + " " + textoPosicao +" e " + acertoCor + " " + textoCor;

                        if (acertoPosicao == 4) {
                            rodada = 6;
                            senhaStringItem.setText("\n" + senha[0] + " - " + senha[1] + " - " + senha[2] + " - " + senha[3]);
                            resultadoStringItem.setText("!!Acertou!!");
                        }

                        if (rodada == 5) {
                            senhaStringItem.setText("\n" + senha[0] + " - " + senha[1] + " - " + senha[2] + " - " + senha[3]);
                            resultadoStringItem.setText("!!Fim das tentativas você errou!!");
                        }

                        tentativaStringItem.setText(historico);
                        historicoStringItem.setText(historico);

                    }


                }

//GEN-LINE:|7-commandAction|8|79-postAction
                // write post-action user code here
            } else if (command == historicoCommand) {//GEN-LINE:|7-commandAction|9|86-preAction
                // write pre-action user code here
                switchDisplayable(null, getHistoricoform());//GEN-LINE:|7-commandAction|10|86-postAction
                // write post-action user code here
            } else if (command == novoJogoCommand) {//GEN-LINE:|7-commandAction|11|94-preAction
                sortear();
                rodada = 0;
                posicao1TextField.setString("");
                posicao2TextField.setString("");
                posicao3TextField.setString("");
                posicao4TextField.setString("");
                historico = "";
                resultadoStringItem.setText("");
                senhaStringItem.setText("????");
                tentativaStringItem.setText("");
                alertaStringItem.setText("");
                historicoStringItem.setText("Ainda não possui rodadas");
//GEN-LINE:|7-commandAction|12|94-postAction

            } else if (command == voltarJogoCommand) {//GEN-LINE:|7-commandAction|13|27-preAction
                // write pre-action user code here
                switchDisplayable(null, getHomeform());//GEN-LINE:|7-commandAction|14|27-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|34-preAction
        } else if (displayable == ajudaform) {
            if (command == voltarAjudaCommand) {//GEN-END:|7-commandAction|15|34-preAction
                // write pre-action user code here
                switchDisplayable(null, getHomeform());//GEN-LINE:|7-commandAction|16|34-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|89-preAction
        } else if (displayable == historicoform) {
            if (command == backCommand) {//GEN-END:|7-commandAction|17|89-preAction
                // write pre-action user code here
                switchDisplayable(null, getJogoform());//GEN-LINE:|7-commandAction|18|89-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|7-postCommandAction
        }//GEN-END:|7-commandAction|19|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|20|
    //</editor-fold>//GEN-END:|7-commandAction|20|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Homeform ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of Homeform component.
     * @return the initialized component instance
     */
    public Form getHomeform() {
        if (Homeform == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            Homeform = new Form("JOGO SENHA", new Item[] { getBannerimageItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            Homeform.addCommand(getInicioCommand());
            Homeform.addCommand(getAjudaCommand());
            Homeform.addCommand(getExitCommand());
            Homeform.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return Homeform;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: BannerimageItem ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of BannerimageItem component.
     * @return the initialized component instance
     */
    public ImageItem getBannerimageItem() {
        if (BannerimageItem == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            BannerimageItem = new ImageItem("", getImage1(), ImageItem.LAYOUT_DEFAULT, "", Item.PLAIN);//GEN-BEGIN:|18-getter|1|18-postInit
            BannerimageItem.setPreferredSize(-1, -1);//GEN-END:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return BannerimageItem;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Jogoform ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of Jogoform component.
     * @return the initialized component instance
     */
    public Form getJogoform() {
        if (Jogoform == null) {//GEN-END:|22-getter|0|22-preInit

            Jogoform = new Form("JOGO SENHA", new Item[] { getOpcaoStringItem(), getAlertaStringItem(), getSpacer2(), getPosicao1TextField(), getPosicao2TextField(), getPosicao3TextField(), getPosicao4TextField(), getSpacer(), getTentativaStringItem(), getResultadoStringItem(), getSpacer1(), getSenhaStringItem() });//GEN-BEGIN:|22-getter|1|22-postInit
            Jogoform.addCommand(getVoltarJogoCommand());
            Jogoform.addCommand(getConfirmarCommand());
            Jogoform.addCommand(getHistoricoCommand());
            Jogoform.addCommand(getNovoJogoCommand());
            Jogoform.setCommandListener(this);//GEN-END:|22-getter|1|22-postInit

        }//GEN-BEGIN:|22-getter|2|
        return Jogoform;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ajudaform ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initiliazed instance of ajudaform component.
     * @return the initialized component instance
     */
    public Form getAjudaform() {
        if (ajudaform == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            ajudaform = new Form("AJUDA", new Item[] { getAjudaStringItem() });//GEN-BEGIN:|31-getter|1|31-postInit
            ajudaform.addCommand(getVoltarAjudaCommand());
            ajudaform.setCommandListener(this);//GEN-END:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return ajudaform;
    }
    //</editor-fold>//GEN-END:|31-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ajudaStringItem ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of ajudaStringItem component.
     * @return the initialized component instance
     */
    public StringItem getAjudaStringItem() {
        if (ajudaStringItem == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            ajudaStringItem = new StringItem("Descri\u00E7\u00E3o do jogo:", "O computador ir\u00E1 montar uma senha com 4 cores das sete poss\u00EDveis.\nO jogador dever\u00E1 tentar descobrir quais foram as cores e as posi\u00E7\u00F5es que o computador escolheu, a cada tentativa do usu\u00E1rio o computador ir\u00E1 informar se o jogador acertou alguma cor e posi\u00E7\u00E3o, mas n\u00E3o informar\u00E1 qual cor ou posi\u00E7\u00E3o que foi acertada.\nCom essa informa\u00E7\u00E3o o jogador deve informar a pr\u00F3xima tentativa, e assim tentar adivinhar a senha antes que suas 5 chances acabem!!");//GEN-LINE:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return ajudaStringItem;
    }
    //</editor-fold>//GEN-END:|38-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: inicioCommand ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initiliazed instance of inicioCommand component.
     * @return the initialized component instance
     */
    public Command getInicioCommand() {
        if (inicioCommand == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            inicioCommand = new Command("Inicio", Command.ITEM, 0);//GEN-LINE:|20-getter|1|20-postInit
            // write post-init user code here
        }//GEN-BEGIN:|20-getter|2|
        return inicioCommand;
    }
    //</editor-fold>//GEN-END:|20-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: voltarJogoCommand ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of voltarJogoCommand component.
     * @return the initialized component instance
     */
    public Command getVoltarJogoCommand() {
        if (voltarJogoCommand == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            voltarJogoCommand = new Command("Voltar", Command.BACK, 0);//GEN-LINE:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return voltarJogoCommand;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ajudaCommand ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of ajudaCommand component.
     * @return the initialized component instance
     */
    public Command getAjudaCommand() {
        if (ajudaCommand == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            ajudaCommand = new Command("Ajuda", Command.ITEM, 0);//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return ajudaCommand;
    }
    //</editor-fold>//GEN-END:|29-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: voltarAjudaCommand ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of voltarAjudaCommand component.
     * @return the initialized component instance
     */
    public Command getVoltarAjudaCommand() {
        if (voltarAjudaCommand == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            voltarAjudaCommand = new Command("Voltar", Command.BACK, 0);//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return voltarAjudaCommand;
    }
    //</editor-fold>//GEN-END:|33-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initiliazed instance of image1 component.
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|19-getter|0|19-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|19-getter|1|19-@java.io.IOException
                image1 = Image.createImage("/imagens/banner.png");
            } catch (java.io.IOException e) {//GEN-END:|19-getter|1|19-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|19-getter|2|19-postInit
            // write post-init user code here
        }//GEN-BEGIN:|19-getter|3|
        return image1;
    }
    //</editor-fold>//GEN-END:|19-getter|3|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: posicao1TextField ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initiliazed instance of posicao1TextField component.
     * @return the initialized component instance
     */
    public TextField getPosicao1TextField() {
        if (posicao1TextField == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            posicao1TextField = new TextField("Posi\u00E7\u00E3o 1", "", 32, TextField.ANY);//GEN-BEGIN:|62-getter|1|62-postInit
            posicao1TextField.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return posicao1TextField;
    }
    //</editor-fold>//GEN-END:|62-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: posicao2TextField ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initiliazed instance of posicao2TextField component.
     * @return the initialized component instance
     */
    public TextField getPosicao2TextField() {
        if (posicao2TextField == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            posicao2TextField = new TextField("Posi\u00E7\u00E3o 2", "", 32, TextField.ANY);//GEN-LINE:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return posicao2TextField;
    }
    //</editor-fold>//GEN-END:|63-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: posicao3TextField ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initiliazed instance of posicao3TextField component.
     * @return the initialized component instance
     */
    public TextField getPosicao3TextField() {
        if (posicao3TextField == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            posicao3TextField = new TextField("Posi\u00E7\u00E3o 3", "", 32, TextField.ANY);//GEN-LINE:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return posicao3TextField;
    }
    //</editor-fold>//GEN-END:|64-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: posicao4TextField ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of posicao4TextField component.
     * @return the initialized component instance
     */
    public TextField getPosicao4TextField() {
        if (posicao4TextField == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            posicao4TextField = new TextField("Posi\u00E7\u00E3o 4", "", 32, TextField.ANY);//GEN-LINE:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return posicao4TextField;
    }
    //</editor-fold>//GEN-END:|65-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initiliazed instance of spacer component.
     * @return the initialized component instance
     */
    public Spacer getSpacer() {
        if (spacer == null) {//GEN-END:|67-getter|0|67-preInit
            // write pre-init user code here
            spacer = new Spacer(16, 4);//GEN-BEGIN:|67-getter|1|67-postInit
            spacer.setLayout(ImageItem.LAYOUT_DEFAULT);
            spacer.setPreferredSize(-1, 10);//GEN-END:|67-getter|1|67-postInit
            // write post-init user code here
        }//GEN-BEGIN:|67-getter|2|
        return spacer;
    }
    //</editor-fold>//GEN-END:|67-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tentativaStringItem ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initiliazed instance of tentativaStringItem component.
     * @return the initialized component instance
     */
    public StringItem getTentativaStringItem() {
        if (tentativaStringItem == null) {//GEN-END:|68-getter|0|68-preInit
            // write pre-init user code here
            tentativaStringItem = new StringItem("Tentativas:", "");//GEN-LINE:|68-getter|1|68-postInit
            // write post-init user code here
        }//GEN-BEGIN:|68-getter|2|
        return tentativaStringItem;
    }
    //</editor-fold>//GEN-END:|68-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer1 ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of spacer1 component.
     * @return the initialized component instance
     */
    public Spacer getSpacer1() {
        if (spacer1 == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            spacer1 = new Spacer(16, 10);//GEN-BEGIN:|69-getter|1|69-postInit
            spacer1.setPreferredSize(-1, 10);//GEN-END:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return spacer1;
    }
    //</editor-fold>//GEN-END:|69-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: senhaStringItem ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of senhaStringItem component.
     * @return the initialized component instance
     */
    public StringItem getSenhaStringItem() {
        if (senhaStringItem == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            senhaStringItem = new StringItem("Senha", "????");//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return senhaStringItem;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resultadoStringItem ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initiliazed instance of resultadoStringItem component.
     * @return the initialized component instance
     */
    public StringItem getResultadoStringItem() {
        if (resultadoStringItem == null) {//GEN-END:|71-getter|0|71-preInit
            // write pre-init user code here
            resultadoStringItem = new StringItem("", "");//GEN-LINE:|71-getter|1|71-postInit
            // write post-init user code here
        }//GEN-BEGIN:|71-getter|2|
        return resultadoStringItem;
    }
    //</editor-fold>//GEN-END:|71-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: opcaoStringItem ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initiliazed instance of opcaoStringItem component.
     * @return the initialized component instance
     */
    public StringItem getOpcaoStringItem() {
        if (opcaoStringItem == null) {//GEN-END:|72-getter|0|72-preInit
            // write pre-init user code here
            opcaoStringItem = new StringItem("Op\u00E7\u00F5es:", "amarelo - azul - vermelho - verde - lilas - roxo - marrom");//GEN-LINE:|72-getter|1|72-postInit
            // write post-init user code here
        }//GEN-BEGIN:|72-getter|2|
        return opcaoStringItem;
    }
    //</editor-fold>//GEN-END:|72-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer2 ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initiliazed instance of spacer2 component.
     * @return the initialized component instance
     */
    public Spacer getSpacer2() {
        if (spacer2 == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            spacer2 = new Spacer(16, 10);//GEN-BEGIN:|73-getter|1|73-postInit
            spacer2.setPreferredSize(-1, 10);//GEN-END:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return spacer2;
    }
    //</editor-fold>//GEN-END:|73-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of screenCommand component.
     * @return the initialized component instance
     */
    public Command getScreenCommand() {
        if (screenCommand == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            screenCommand = new Command("Tela", Command.SCREEN, 0);//GEN-LINE:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return screenCommand;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand1 ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initiliazed instance of screenCommand1 component.
     * @return the initialized component instance
     */
    public Command getScreenCommand1() {
        if (screenCommand1 == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            screenCommand1 = new Command("cade", Command.SCREEN, 0);//GEN-LINE:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return screenCommand1;
    }
    //</editor-fold>//GEN-END:|76-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: confirmarCommand ">//GEN-BEGIN:|78-getter|0|78-preInit
    /**
     * Returns an initiliazed instance of confirmarCommand component.
     * @return the initialized component instance
     */
    public Command getConfirmarCommand() {
        if (confirmarCommand == null) {//GEN-END:|78-getter|0|78-preInit
            // write pre-init user code here
            confirmarCommand = new Command("Confirmar", Command.ITEM, 0);//GEN-LINE:|78-getter|1|78-postInit
            // write post-init user code here
        }//GEN-BEGIN:|78-getter|2|
        return confirmarCommand;
    }
    //</editor-fold>//GEN-END:|78-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            exitCommand = new Command("Sair", Command.EXIT, 0);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: historicoform ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initiliazed instance of historicoform component.
     * @return the initialized component instance
     */
    public Form getHistoricoform() {
        if (historicoform == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            historicoform = new Form("HIST\u00D3RICO DE ACERTOS", new Item[] { getHistoricoStringItem() });//GEN-BEGIN:|84-getter|1|84-postInit
            historicoform.addCommand(getBackCommand());
            historicoform.setCommandListener(this);//GEN-END:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return historicoform;
    }
    //</editor-fold>//GEN-END:|84-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: historicoStringItem ">//GEN-BEGIN:|91-getter|0|91-preInit
    /**
     * Returns an initiliazed instance of historicoStringItem component.
     * @return the initialized component instance
     */
    public StringItem getHistoricoStringItem() {
        if (historicoStringItem == null) {//GEN-END:|91-getter|0|91-preInit
            // write pre-init user code here
            historicoStringItem = new StringItem("Hist\u00F3rico:", "Ainda n\u00E3o possui rodadas");//GEN-LINE:|91-getter|1|91-postInit
            // write post-init user code here
        }//GEN-BEGIN:|91-getter|2|
        return historicoStringItem;
    }
    //</editor-fold>//GEN-END:|91-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: historicoCommand ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of historicoCommand component.
     * @return the initialized component instance
     */
    public Command getHistoricoCommand() {
        if (historicoCommand == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            historicoCommand = new Command("Hist\u00F3rico", Command.ITEM, 0);//GEN-LINE:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return historicoCommand;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|88-getter|0|88-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
            backCommand = new Command("Voltar", Command.BACK, 0);//GEN-LINE:|88-getter|1|88-postInit
            // write post-init user code here
        }//GEN-BEGIN:|88-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|88-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: novoJogoCommand ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initiliazed instance of novoJogoCommand component.
     * @return the initialized component instance
     */
    public Command getNovoJogoCommand() {
        if (novoJogoCommand == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            novoJogoCommand = new Command("Novo jogo", Command.ITEM, 0);//GEN-LINE:|93-getter|1|93-postInit
            // write post-init user code here
        }//GEN-BEGIN:|93-getter|2|
        return novoJogoCommand;
    }
    //</editor-fold>//GEN-END:|93-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: alertaStringItem ">//GEN-BEGIN:|95-getter|0|95-preInit
    /**
     * Returns an initiliazed instance of alertaStringItem component.
     * @return the initialized component instance
     */
    public StringItem getAlertaStringItem() {
        if (alertaStringItem == null) {//GEN-END:|95-getter|0|95-preInit
            // write pre-init user code here
            alertaStringItem = new StringItem("", "", Item.PLAIN);//GEN-BEGIN:|95-getter|1|95-postInit
            alertaStringItem.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|95-getter|1|95-postInit
            // write post-init user code here
        }//GEN-BEGIN:|95-getter|2|
        return alertaStringItem;
    }
    //</editor-fold>//GEN-END:|95-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}

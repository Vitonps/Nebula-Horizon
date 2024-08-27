package jogorpga3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MenuPrincipal {
    
    // Variaveis globais

    String nome = "DefaultName"; // Defina um nome default
    int modelo = 1; // Defina um modelo default

    JanelaGameplay janelagameplay = new JanelaGameplay(nome, modelo);
    
    Sounds musicaInicial = new Sounds();
    private JTextField nomeDoPersonagem;
    private JTextField escolherModelo;
    private BufferedImage modelo1;
    private BufferedImage modelo2;
    private BufferedImage modelo3;
    private BufferedImage modelo4;
    private BufferedImage modelo5;
    private BufferedImage modelo6;
    private BufferedImage modelo7;
    private BufferedImage modelo8;
    private BufferedImage modelo9;
    private BufferedImage modelo10;
    private BufferedImage modelo11;
    private BufferedImage modelo12;
    private BufferedImage modelo13;
    private BufferedImage modelo14;
    private BufferedImage modelo15;
    private BufferedImage modelo16;
    private BufferedImage modelo17;
    private BufferedImage modelo18;
    private BufferedImage modelo19;
    private BufferedImage modelo20;
    private boolean bMusicaInicial = true;

    public void exibir() {

       // Obtem e coloca a imagem dentro de uma BufferedImage
       BufferedImage imgTelaInicial = null; // Imagem de Fundo da TelaInicial
       BufferedImage imgFundoNovoJogo = null; // Imagem de Fundo do Novo Jogo
       BufferedImage imgFundoCreditos = null; // Imagem de Fundo do Creditos
       BufferedImage imgBotaoNovoJogo = null; // Imagem do Botao de Novo Jogo
       BufferedImage imgBotaoCreditos = null; // Imagem do Botao de Creditos
       BufferedImage imgBotaoSairDoJogo = null; // Imagem do Botao de Sair Do Jogo
       BufferedImage imgBotaoVoltarNovoJogo = null; // Imagem do Botão Voltar do Novo Jogo
       BufferedImage imgBotaoVoltarCreditos = null; // Imagem do Botão Voltar do Creditos
       BufferedImage imgBotaoCriarPersonagem = null; // Imagem do Botão Voltar do Creditos
       BufferedImage imgFundoTutorial = null; // Imagem do Botão Voltar do Creditos
       BufferedImage imgBotaoIniciar = null; // Imagem do Botão Iniciar Na Historia
       BufferedImage icone = null;
       
       if (bMusicaInicial == true) {
           musicaInicial.carregarSom("Sons/musicaInicial.wav");
           musicaInicial.tocarSomEmLoop("Sons/musicaInicial.wav");
           bMusicaInicial = false;
       }
       
        
        try {
            // Carregamento das Imagens
            imgTelaInicial = ImageIO.read(new File("imagens/MenuPrincipal/MenuPrincipal/imgTelaInicial.png")); // Carrega a imagem do fundo do Menu Principal
            imgFundoNovoJogo = ImageIO.read(new File("imagens/MenuPrincipal/NovoJogo/imgFundoNovoJogo.png")); // Carrega a imagem do fundo do Novo Jogo
            imgFundoCreditos = ImageIO.read(new File("imagens/MenuPrincipal/Creditos/imgFundoCreditos.png")); // Carrega a imagem do fundo do Creditos
            imgBotaoNovoJogo = ImageIO.read(new File("imagens/MenuPrincipal/MenuPrincipal/imgBotaoNovoJogo.jpg")); // Carrega a imagem do botão de Novo Jogo
            imgBotaoCreditos = ImageIO.read(new File("imagens/MenuPrincipal/MenuPrincipal/imgBotaoCreditos.jpg")); // Carrega a imagem do botão de Creditos
            imgBotaoSairDoJogo = ImageIO.read(new File("imagens/MenuPrincipal/MenuPrincipal/imgBotaoSairDoJogo.jpg")); // Carrega a imagem do botão de Sair Do Jogo
            imgBotaoVoltarNovoJogo = ImageIO.read(new File("imagens/MenuPrincipal/NovoJogo/imgBotaoVoltarNovoJogo.jpg")); // Carrega a imagem do botão de voltar do Novo Jogo
            imgBotaoVoltarCreditos = ImageIO.read(new File("imagens/MenuPrincipal/Creditos/imgBotaoVoltarCreditos.jpg")); // Carrega a imagem do botão de voltar do Creditos
            imgBotaoCriarPersonagem = ImageIO.read(new File("imagens/MenuPrincipal/NovoJogo/imgBotaoCriarPersonagem.png")); // Carrega a imagem do botão de Criar Personagem do Novo Jogo
            imgFundoTutorial = ImageIO.read(new File("imagens/MenuPrincipal/Tutorial/imgFundoTutorial.png")); // Carrega a imagem do botão de Criar Personagem do Novo Jogo
            imgBotaoIniciar = ImageIO.read(new File("imagens/MenuPrincipal/Tutorial/imgBotaoIniciar.png")); // Carrega a imagem do botão de Criar Personagem do Novo Jogo
            icone = ImageIO.read(new File("imagens/icon.png"));
            
            
            modelo1 = ImageIO.read(new File("imagens/player/modelo1/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo2 = ImageIO.read(new File("imagens/player/modelo2/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo3 = ImageIO.read(new File("imagens/player/modelo3/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo4 = ImageIO.read(new File("imagens/player/modelo4/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo5 = ImageIO.read(new File("imagens/player/modelo5/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo6 = ImageIO.read(new File("imagens/player/modelo6/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo7 = ImageIO.read(new File("imagens/player/modelo7/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo8 = ImageIO.read(new File("imagens/player/modelo8/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo9 = ImageIO.read(new File("imagens/player/modelo9/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo10 = ImageIO.read(new File("imagens/player/modelo10/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo11 = ImageIO.read(new File("imagens/player/modelo11/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo12 = ImageIO.read(new File("imagens/player/modelo12/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo13 = ImageIO.read(new File("imagens/player/modelo13/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo14 = ImageIO.read(new File("imagens/player/modelo14/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo15 = ImageIO.read(new File("imagens/player/modelo15/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo16 = ImageIO.read(new File("imagens/player/modelo16/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo17 = ImageIO.read(new File("imagens/player/modelo17/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo18 = ImageIO.read(new File("imagens/player/modelo18/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo19 = ImageIO.read(new File("imagens/player/modelo19/modeloFrente1.png")); // Leia a imagem do modelo desejado
            modelo20 = ImageIO.read(new File("imagens/player/modelo20/modeloFrente1.png")); // Leia a imagem do modelo desejado
        } catch (IOException e) {
            System.err.println("Erro ao carregar imagens na classe MenuPrincipal!" + e.getMessage()); // Mensagem de erro caso dê algum problema de carregamento de iamgem
            System.exit(1); // Caso de problema ele ira finalizar o progama
        }
        
        // Cria e configura a janela para o JPanel do menu principal
        JFrame janela = new JFrame(); // Cria uma Interface Grafica
        janela.setTitle("Nebula Horizon");
        janela.setIconImage(icone);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Modo de fechar a janela
        Dimension screenSize = new Dimension(1280,768);
        janela.setSize(1280, 768); // Resolução da janela
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        
        // Centralização dos botões.
        int larguraBotao = 300; // Determina a largura do botão
        int posicaoX = janela.getWidth() / 2 - larguraBotao / 2; // Calculo para a centralização horizontal na tela
        
        // Cria e configura um JFrame para o NovoJogo
        JFrame FNovoJogo = new JFrame(); // Cria uma Interface Grafica
        FNovoJogo.setTitle("Nebula Horizon");
        FNovoJogo.setIconImage(icone);
        FNovoJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Modo de fechar a janela
        FNovoJogo.setSize(1280, 768); // Resolução da janela
        FNovoJogo.setLocationRelativeTo(null);
        FNovoJogo.setResizable(false);
        
        // Cria e configura um JFrame para os Creditos
        JFrame FCreditos = new JFrame(); // Cria uma Interface Grafica
        FCreditos.setTitle("Nebula Horizon");
        FCreditos.setIconImage(icone);
        FCreditos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Modo de fechar a janela
        FCreditos.setSize(1280, 768); // Resolução da janela
        FCreditos.setLocationRelativeTo(null);
        FCreditos.setResizable(false);
        
        JFrame FTutorial = new JFrame(); // Cria uma Interface Grafica
        FTutorial.setTitle("Nebula Horizon");
        FTutorial.setIconImage(icone);
        FTutorial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Modo de fechar a janela
        FTutorial.setSize(1280, 768); // Resolução da janela
        FTutorial.setLocationRelativeTo(null);
        FTutorial.setResizable(false);
 
        // Cria um JPanel para o Menu Principal
        JPanel painel = new JPanel(); // Cria um elemento de Painel
        painel.setLayout(null); // Permite posicionar os elementos livremente
        janela.add(painel); // Adiciona o Painel na interface Grafico

        // Cria e configura o texto principal da Tela Inicial
        JLabel nomeDoJogo = new JLabel(); // Cria um novo elemento de Texto
        nomeDoJogo.setText("Nebula Horizon"); // Texto Escrito
        nomeDoJogo.setFont(new Font("Calibri", Font.BOLD, 90)); // Configura o texto em fonte, tipo de escrita e tamanho.
        nomeDoJogo.setForeground(Color.white); // Cor do texto
        nomeDoJogo.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto horizontalmente
        nomeDoJogo.setBounds(0, 90, janela.getWidth(), 100); // Define posição e tamanho
        painel.add(nomeDoJogo); // Adiciona o label ao painel
        
        // Crie e configura o texto da versão do jogo
        JLabel versao = new JLabel(); // Cria um novo elemento de Texto
        versao.setText("Versao: Beta 0.5"); // Texto Escrito
        versao.setFont(new Font("Calibri", Font.BOLD, 15)); // Configura o texto em fonte, tipo de escrita e tamanho.
        versao.setForeground(Color.white); // Cor do texto
        versao.setBounds(0, 0, janela.getWidth(), 30); // Define posição e tamanho
        painel.add(versao); // Adiciona o label ao painel
        
        // Criando Botões
        // Criação do botao "Novo Jogo"
        JButton novoJogo = new JButton(); // Cria o elemento Botão
        estiloBotoesComBorder(novoJogo);//Estilo pro botao
        novoJogo.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        novoJogo.setBounds(posicaoX, 190, larguraBotao, 80); // Posição do Botão
        novoJogo.setLayout(new BorderLayout());
        painel.add(novoJogo); // Acicionando o botao no painel
        novoJogo.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria e exibe a janela do jogo
                janela.setVisible(false); // Fecha o JFrame do Menu Principal
                FNovoJogo.setVisible(true); // Abre o JFrame do NovoJogo
            }
        });
        
        // Criação do botao "Creditos"
        JButton creditos = new JButton();// Cria o elemento Botão
        estiloBotoesComBorder(creditos);//Estilo pro botao
        creditos.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        creditos.setBounds(posicaoX, 272, 300, 80); // Posição do Botão
        creditos.setLayout(new BorderLayout());
        // Texto "Creditos" centralizado horizontal e verticalmente no botão
        painel.add(creditos); // Acicionando o botao no painel
        creditos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible(false); // Fecha o JFrame do Menu Principal
                FCreditos.setVisible(true); // Abre o JFrame do Creditos
            }
        });
        
        // Criação do botao "Sair Do Jogo"
        JButton sairDoJogo = new JButton();// Cria o elemento Botão
        estiloBotoesComBorder(sairDoJogo);//Estilo pro botao
        sairDoJogo.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        sairDoJogo.setBounds(posicaoX, 354, 300, 80); // Posição do Botão
        sairDoJogo.setLayout(new BorderLayout());
        painel.add(sairDoJogo); // Acicionando o botao no painel
        sairDoJogo.addActionListener(new ActionListener() { // Caso o botão seja clicado
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Sair Do Jogo clicado!");
                System.exit(0); // Comando para o progama fechar
            }
        });
        
        // Criação do botao "Criar Personagem" para FNovoJogo
        JButton criarPersonagem = new JButton(); // Cria o elemento Botão
        estiloBotoesComBorder(criarPersonagem);//Estilo pro botao
        criarPersonagem.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        criarPersonagem.setBounds(posicaoX, 530, 300, 80); // Posição do Botão
        criarPersonagem.setLayout(new BorderLayout());
        FNovoJogo.add(criarPersonagem); // Acicionando o botao no painel
        criarPersonagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoModelo = escolherModelo.getText();
                String nomePersonagem = nomeDoPersonagem.getText().trim();

                // Verificar se o campo de nome está preenchido e contém apenas letras
                if (nomePersonagem.isEmpty()) {
                    JOptionPane.showMessageDialog(FNovoJogo, "Por favor, digite um nome para o personagem.");
                    return; // Interrompe a execução se o nome estiver vazio
                } else if (!nomePersonagem.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(FNovoJogo, "O nome só pode conter letras!");
                    return; // Interrompe a execução se o nome contem caracteres inválidos
                }

                try {
                    // Tenta converter o texto para um inteiro
                    int numeroModelo = Integer.parseInt(textoModelo);
                    // Se a conversão for bem-sucedida, verifica se o número está entre 1 e 20
                    if (numeroModelo >= 1 && numeroModelo <= 20) {
                        // Se o número estiver dentro do intervalo, mostrar o FTutorial
                        FTutorial.setVisible(true);
                        FNovoJogo.setVisible(false);
                    } else {
                        // Se o número estiver fora do intervalo, exibir uma mensagem de erro
                        JOptionPane.showMessageDialog(FNovoJogo, "Por favor, digite um número entre 1 e 20.");
                    }
                } catch (NumberFormatException ex) {
                    // Se o texto não for um número, exibir uma mensagem de erro
                    JOptionPane.showMessageDialog(FNovoJogo, "Por favor, digite um número válido.");
                }
            }
        });
        // Criação do botao "voltar" para FNovoJogo
        JButton voltar = new JButton(); // Cria o elemento Botão
        estiloBotoesComBorder(voltar);//Estilo pro botao
        voltar.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        voltar.setBounds(posicaoX, 618, 300, 80); // Posição do Botão
        voltar.setLayout(new BorderLayout());
        FNovoJogo.add(voltar); // Acicionando o botao no painel
        voltar.addActionListener(new ActionListener() { // Caso o botão seja clicado
            @Override
            public void actionPerformed(ActionEvent e) {
                exibir();
                FNovoJogo.setVisible(false);
            }
        });
        
        // Criação do botao "voltar" para FConfiguracoes
        JButton voltar3 = new JButton(); // Cria o elemento Botão
        estiloBotoesComBorder(voltar3);//Estilo pro botao
        voltar3.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        voltar3.setBounds(posicaoX, 618, 300, 80); // Posição do Botão
        voltar3.setLayout(new BorderLayout());
        FCreditos.add(voltar3);
        voltar3.addActionListener(new ActionListener() { // Caso o botão seja clicado
            @Override
            public void actionPerformed(ActionEvent e) {
                exibir();
                FCreditos.setVisible(false);
            }
        });
        
        // Criação do botao "iniciar" para FTutorial
        JButton iniciar = new JButton(); // Cria o elemento Botão
        estiloBotoesComBorder(iniciar);//Estilo pro botao
        iniciar.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        iniciar.setBounds(posicaoX, 618, 300, 80); // Posição do Botão
        iniciar.setLayout(new BorderLayout());
        FTutorial.add(iniciar);
        iniciar.addActionListener(new ActionListener() { // Caso o botão seja clicado
            @Override
            public void actionPerformed(ActionEvent e) {
            FTutorial.setVisible(false);
            
            musicaInicial.pararSom();

            // Obter os dados do personagem
            String nomePersonagem = nomeDoPersonagem.getText();
            int modeloSelecionado = Integer.parseInt(escolherModelo.getText()); // Supondo que o modelo é um número
            
            musicaInicial.pararSom();

            JanelaGameplay janelaGameplay = new JanelaGameplay(nomePersonagem, modeloSelecionado); // Passar os dados no construtor
            janelaGameplay.exibir();
            
            musicaInicial.pararSom(); 
            }
        });

        // Colocando Imagens de fundo dos botões
        ImageIcon iconeBotaoNovoJogo = new ImageIcon(imgBotaoNovoJogo);
        ImageIcon iconeBotaoCreditos = new ImageIcon(imgBotaoCreditos);
        ImageIcon iconeBotaoSairDoJogo = new ImageIcon(imgBotaoSairDoJogo);
        ImageIcon iconeBotaoVoltarNovoJogo = new ImageIcon(imgBotaoVoltarNovoJogo);
        ImageIcon iconeBotaoVoltarCreditos = new ImageIcon(imgBotaoVoltarCreditos);
        ImageIcon iconeBotaoCriarPersonagem = new ImageIcon(imgBotaoCriarPersonagem);
        ImageIcon iconeBotaoIniciar = new ImageIcon(imgBotaoIniciar);
        
        novoJogo.setIcon(iconeBotaoNovoJogo); // Seta a imagens ao fundo dos botão
        creditos.setIcon(iconeBotaoCreditos); // Seta a imagens ao fundo dos botão
        sairDoJogo.setIcon(iconeBotaoSairDoJogo); // Seta a imagens ao fundo dos botão
        voltar.setIcon(iconeBotaoVoltarNovoJogo); // Seta a imagens ao fundo dos botão
        criarPersonagem.setIcon(iconeBotaoCriarPersonagem); // Seta a imagens ao fundo dos botão
        iniciar.setIcon(iconeBotaoIniciar); // Seta a imagens ao fundo dos botão
        voltar3.setIcon(iconeBotaoVoltarCreditos); // Seta a imagens ao fundo dos botão
        
        // Configuração da imagem de fundo do menu principal
        Image dimg = imgTelaInicial.getScaledInstance(janela.getWidth(), janela.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        JLabel labelImg = new JLabel(imageIcon);
        labelImg.setBounds(0, 0, janela.getWidth(), janela.getHeight());
        painel.add(labelImg);
        
        // Configuração da imagem de fundo do NovoJogo
        Image dimg1 = imgFundoNovoJogo.getScaledInstance(FNovoJogo.getWidth(), FNovoJogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon1 = new ImageIcon(dimg1);
        JLabel labelImg1 = new JLabel(imageIcon1);
        labelImg1.setBounds(0, 0, FNovoJogo.getWidth(), FNovoJogo.getHeight());
        
        int larguraPersonagem = 30;
        int alturaPersonagem = 70;
        
        // Desenhando os modelos dos personagens no NovoJogo
        ImageIcon modelo1Icon = new ImageIcon(modelo1); // Cria um ImageIcon a partir da imagem
        JLabel modelo1Label = new JLabel(modelo1Icon); // Cria um JLabel com o ImageIcon
        modelo1Label.setBounds(250 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m1 = new JLabel(); // Cria um novo elemento de Texto
        m1.setText("1"); // Texto Escrito
        m1.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m1.setForeground(Color.white); // Cor do texto
        m1.setBounds(250 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m1);
        
        
        ImageIcon modelo2Icon = new ImageIcon(modelo2); // Cria um ImageIcon a partir da imagem
        JLabel modelo2Label = new JLabel(modelo2Icon); // Cria um JLabel com o ImageIcon
        modelo2Label.setBounds(300 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m2 = new JLabel(); // Cria um novo elemento de Texto
        m2.setText("2"); // Texto Escrito
        m2.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m2.setForeground(Color.white); // Cor do texto
        m2.setBounds(300 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m2);
        
        ImageIcon modelo3Icon = new ImageIcon(modelo3); // Cria um ImageIcon a partir da imagem
        JLabel modelo3Label = new JLabel(modelo3Icon); // Cria um JLabel com o ImageIcon
        modelo3Label.setBounds(350 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m3 = new JLabel(); // Cria um novo elemento de Texto
        m3.setText("3"); // Texto Escrito
        m3.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m3.setForeground(Color.white); // Cor do texto
        m3.setBounds(350 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m3);
        
        ImageIcon modelo4Icon = new ImageIcon(modelo4); // Cria um ImageIcon a partir da imagem
        JLabel modelo4Label = new JLabel(modelo4Icon); // Cria um JLabel com o ImageIcon
        modelo4Label.setBounds(400 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m4 = new JLabel(); // Cria um novo elemento de Texto
        m4.setText("4"); // Texto Escrito
        m4.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m4.setForeground(Color.white); // Cor do texto
        m4.setBounds(400 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m4);
        
        ImageIcon modelo5Icon = new ImageIcon(modelo5); // Cria um ImageIcon a partir da imagem
        JLabel modelo5Label = new JLabel(modelo5Icon); // Cria um JLabel com o ImageIcon
        modelo5Label.setBounds(450 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m5 = new JLabel(); // Cria um novo elemento de Texto
        m5.setText("5"); // Texto Escrito
        m5.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m5.setForeground(Color.white); // Cor do texto
        m5.setBounds(450 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m5);
        
        ImageIcon modelo6Icon = new ImageIcon(modelo6); // Cria um ImageIcon a partir da imagem
        JLabel modelo6Label = new JLabel(modelo6Icon); // Cria um JLabel com o ImageIcon
        modelo6Label.setBounds(500 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m6 = new JLabel(); // Cria um novo elemento de Texto
        m6.setText("6"); // Texto Escrito
        m6.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m6.setForeground(Color.white); // Cor do texto
        m6.setBounds(500 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m6);
        
        ImageIcon modelo7Icon = new ImageIcon(modelo7); // Cria um ImageIcon a partir da imagem
        JLabel modelo7Label = new JLabel(modelo7Icon); // Cria um JLabel com o ImageIcon
        modelo7Label.setBounds(550 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m7 = new JLabel(); // Cria um novo elemento de Texto
        m7.setText("7"); // Texto Escrito
        m7.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m7.setForeground(Color.white); // Cor do texto
        m7.setBounds(550 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m7);
        
        ImageIcon modelo8Icon = new ImageIcon(modelo8); // Cria um ImageIcon a partir da imagem
        JLabel modelo8Label = new JLabel(modelo8Icon); // Cria um JLabel com o ImageIcon
        modelo8Label.setBounds(600 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m8 = new JLabel(); // Cria um novo elemento de Texto
        m8.setText("8"); // Texto Escrito
        m8.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m8.setForeground(Color.white); // Cor do texto
        m8.setBounds(600 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m8);
        
        ImageIcon modelo9Icon = new ImageIcon(modelo9); // Cria um ImageIcon a partir da imagem
        JLabel modelo9Label = new JLabel(modelo9Icon); // Cria um JLabel com o ImageIcon
        modelo9Label.setBounds(650 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m9 = new JLabel(); // Cria um novo elemento de Texto
        m9.setText("9"); // Texto Escrito
        m9.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m9.setForeground(Color.white); // Cor do texto
        m9.setBounds(650 - 90, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m9);
        
        ImageIcon modelo10Icon = new ImageIcon(modelo10); // Cria um ImageIcon a partir da imagem
        JLabel modelo10Label = new JLabel(modelo10Icon); // Cria um JLabel com o ImageIcon
        modelo10Label.setBounds(700 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m10 = new JLabel(); // Cria um novo elemento de Texto
        m10.setText("10"); // Texto Escrito
        m10.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m10.setForeground(Color.white); // Cor do texto
        m10.setBounds(700 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m10);
        
        ImageIcon modelo11Icon = new ImageIcon(modelo11); // Cria um ImageIcon a partir da imagem
        JLabel modelo11Label = new JLabel(modelo11Icon); // Cria um JLabel com o ImageIcon
        modelo11Label.setBounds(750 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m11 = new JLabel(); // Cria um novo elemento de Texto
        m11.setText("11"); // Texto Escrito
        m11.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m11.setForeground(Color.white); // Cor do texto
        m11.setBounds(750 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m11);
        
        ImageIcon modelo12Icon = new ImageIcon(modelo12); // Cria um ImageIcon a partir da imagem
        JLabel modelo12Label = new JLabel(modelo12Icon); // Cria um JLabel com o ImageIcon
        modelo12Label.setBounds(800 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m12 = new JLabel(); // Cria um novo elemento de Texto
        m12.setText("12"); // Texto Escrito
        m12.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m12.setForeground(Color.white); // Cor do texto
        m12.setBounds(800 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m12);
        
        ImageIcon modelo13Icon = new ImageIcon(modelo13); // Cria um ImageIcon a partir da imagem
        JLabel modelo13Label = new JLabel(modelo13Icon); // Cria um JLabel com o ImageIcon
        modelo13Label.setBounds(850 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m13 = new JLabel(); // Cria um novo elemento de Texto
        m13.setText("13"); // Texto Escrito
        m13.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m13.setForeground(Color.white); // Cor do texto
        m13.setBounds(850 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m13);
        
        ImageIcon modelo14Icon = new ImageIcon(modelo14); // Cria um ImageIcon a partir da imagem
        JLabel modelo14Label = new JLabel(modelo14Icon); // Cria um JLabel com o ImageIcon
        modelo14Label.setBounds(900 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m14 = new JLabel(); // Cria um novo elemento de Texto
        m14.setText("14"); // Texto Escrito
        m14.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m14.setForeground(Color.white); // Cor do texto
        m14.setBounds(900 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m14);
        
        ImageIcon modelo15Icon = new ImageIcon(modelo15); // Cria um ImageIcon a partir da imagem
        JLabel modelo15Label = new JLabel(modelo15Icon); // Cria um JLabel com o ImageIcon
        modelo15Label.setBounds(950 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m15 = new JLabel(); // Cria um novo elemento de Texto
        m15.setText("15"); // Texto Escrito
        m15.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m15.setForeground(Color.white); // Cor do texto
        m15.setBounds(950 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m15);
        
        ImageIcon modelo16Icon = new ImageIcon(modelo16); // Cria um ImageIcon a partir da imagem
        JLabel modelo16Label = new JLabel(modelo16Icon); // Cria um JLabel com o ImageIcon
        modelo16Label.setBounds(1000 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m16 = new JLabel(); // Cria um novo elemento de Texto
        m16.setText("16"); // Texto Escrito
        m16.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m16.setForeground(Color.white); // Cor do texto
        m16.setBounds(1000 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m16);
        
        ImageIcon modelo17Icon = new ImageIcon(modelo17); // Cria um ImageIcon a partir da imagem
        JLabel modelo17Label = new JLabel(modelo17Icon); // Cria um JLabel com o ImageIcon
        modelo17Label.setBounds(1050 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m17 = new JLabel(); // Cria um novo elemento de Texto
        m17.setText("17"); // Texto Escrito
        m17.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m17.setForeground(Color.white); // Cor do texto
        m17.setBounds(1050 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m17);
        
        ImageIcon modelo18Icon = new ImageIcon(modelo18); // Cria um ImageIcon a partir da imagem
        JLabel modelo18Label = new JLabel(modelo18Icon); // Cria um JLabel com o ImageIcon
        modelo18Label.setBounds(1100 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m18 = new JLabel(); // Cria um novo elemento de Texto
        m18.setText("18"); // Texto Escrito
        m18.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m18.setForeground(Color.white); // Cor do texto
        m18.setBounds(1100 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m18);
        
        ImageIcon modelo19Icon = new ImageIcon(modelo19); // Cria um ImageIcon a partir da imagem
        JLabel modelo19Label = new JLabel(modelo19Icon); // Cria um JLabel com o ImageIcon
        modelo19Label.setBounds(1150 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m19 = new JLabel(); // Cria um novo elemento de Texto
        m19.setText("19"); // Texto Escrito
        m19.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m19.setForeground(Color.white); // Cor do texto
        m19.setBounds(1150 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m19);
        
        ImageIcon modelo20Icon = new ImageIcon(modelo20); // Cria um ImageIcon a partir da imagem
        JLabel modelo20Label = new JLabel(modelo20Icon); // Cria um JLabel com o ImageIcon
        modelo20Label.setBounds(1200 - 100, 200, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        JLabel m20 = new JLabel(); // Cria um novo elemento de Texto
        m20.setText("20"); // Texto Escrito
        m20.setFont(new Font("Calibri", Font.BOLD, 20)); // Configura o texto em fonte, tipo de escrita e tamanho.
        m20.setForeground(Color.white); // Cor do texto
        m20.setBounds(1200 - 95, 240, larguraPersonagem, alturaPersonagem); // Define a posição e tamanho do JLabel
        FNovoJogo.add(m20);
        
        // Cria e configura o texto Nome Do Personagem no Novo Jogo
        JLabel labelNomeDoPersonagem = new JLabel(); // Cria um novo elemento de Texto
        labelNomeDoPersonagem.setText("Nome Do Personagem"); // Texto Escrito
        labelNomeDoPersonagem.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        labelNomeDoPersonagem.setForeground(Color.white); // Cor do texto
        labelNomeDoPersonagem.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto horizontalmente
        labelNomeDoPersonagem.setBounds(0, 80, janela.getWidth(), 100); // Define posição e tamanho
        FNovoJogo.add(labelNomeDoPersonagem); // Adiciona o label ao painel
        
        // Adicione a caixa de texto abaixo do labelNomeDoPersonagem
        nomeDoPersonagem = new JTextField(80);
        nomeDoPersonagem.setBounds(500, 155, 280, 40); // Define a posição e o tamanho
        nomeDoPersonagem.setVisible(true);
        FNovoJogo.add(nomeDoPersonagem); // Adiciona o JTextField ao JFrame
        
        // Cria e configura o texto Modelo Do Personagem no Novo Jogo
        JLabel labelModeloDesejado = new JLabel(); // Cria um novo elemento de Texto
        labelModeloDesejado.setText("Com qual modelo deseja jogar?"); // Texto Escrito
        labelModeloDesejado.setFont(new Font("Calibri", Font.BOLD, 30)); // Configura o texto em fonte, tipo de escrita e tamanho.
        labelModeloDesejado.setForeground(Color.white); // Cor do texto
        labelModeloDesejado.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto horizontalmente
        labelModeloDesejado.setBounds(0, 265, janela.getWidth(), 100); // Define posição e tamanho
        FNovoJogo.add(labelModeloDesejado); // Adiciona o label ao painel
        
        // Adicione a caixa de texto abaixo do labelNomeDoPersonagem
        escolherModelo = new JTextField(80);
        escolherModelo.setBounds(500, 340, 280, 40); // Define a posição e o tamanho
        escolherModelo.setVisible(true);
        FNovoJogo.add(escolherModelo); // Adiciona o JTextField ao JFrame
        
        // Adiciona os JLabels ao JFrame FNovoJogo na ordem correta
        FNovoJogo.add(modelo1Label); // Adiciona essa imagem 1º
        FNovoJogo.add(modelo2Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo3Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo4Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo5Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo6Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo7Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo8Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo9Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo10Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo11Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo12Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo13Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo14Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo15Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo16Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo17Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo18Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo19Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(modelo20Label); // Adiciona essa imagem depois da anterior
        FNovoJogo.add(labelImg1); // Adiciona o fundo por último
        
        // Configuração da imagem de fundo dos creditos
        Image dimg5 = imgFundoCreditos.getScaledInstance(FCreditos.getWidth(), FCreditos.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon5 = new ImageIcon(dimg5);
        JLabel labelImg5 = new JLabel(imageIcon5);
        labelImg.setBounds(0, 0, FCreditos.getWidth(), FCreditos.getHeight());
        FCreditos.add(labelImg5);
        
        // Configuração da imagem de fundo dos creditos
        Image dimg6 = imgFundoTutorial.getScaledInstance(FCreditos.getWidth(), FCreditos.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon6 = new ImageIcon(dimg6);
        JLabel labelImg6 = new JLabel(imageIcon6);
        labelImg.setBounds(0, 0, FCreditos.getWidth(), FCreditos.getHeight());
        FTutorial.add(labelImg6);

        // Mostra a janela
        janela.setVisible(true);
        
    }
    
    //Funcao para estilo dos botoes
    public void estiloBotoesComBorder(JButton botao) {
        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Muda o cursor para o estilo "hand"
                botao.setBorder(BorderFactory.createLineBorder(Color.BLUE)); // Adiciona borda azul ao entrar
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botao.setCursor(Cursor.getDefaultCursor()); // Retorna o cursor ao padrão
                botao.setBorder(BorderFactory.createEmptyBorder()); // Remove a borda ao sair
            }
        });
    }
}

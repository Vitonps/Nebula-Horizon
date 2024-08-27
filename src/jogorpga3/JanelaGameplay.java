package jogorpga3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class JanelaGameplay{

    private Player player; // Atributo para a instância do Player
    private Mapa mapaAtual; // Atributo para o mapa atual

    private JFrame jogo; // Referência para o JFrame

    public JanelaGameplay(String nome, int modelo) {
        // Construtor que recebe os dados

        // Cria o mapa inicial
        mapaAtual = new Mapa(1, null);

        // Criar a instância do Player com os dados recebidos e o mapa inicial
        player = new Player(nome, modelo, mapaAtual);
        
        jogo = new JFrame(); // Inicializa o JFrame
        jogo.setTitle("Nebula Horizon"); // Titulo da janela
        jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Tipo de fechamento da janela
        jogo.setLocationRelativeTo(null);
        jogo.setResizable(false);
        jogo.setSize(1280, 768); // Resolução da janela
        jogo.setLocationRelativeTo(null); // Sempre abrirá no meio da tela
        BufferedImage icone = null;
        try {
            icone = ImageIO.read(new File("imagens/icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(JanelaGameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        jogo.setIconImage(icone); // Seta o icone do jogo, invez da imagem do java, ira aparecer a logo do jogo

        // Adicionar o Player ao JFrame
        jogo.add(player);
        player.setFocusable(true);
        player.requestFocusInWindow();
        // Adiciona o KeyListener ao Player
        player.addKeyListener(player);
        jogo.setPreferredSize(new Dimension(1280, 768));
        
        // Inicialmente invisível
        jogo.setVisible(false);
    }
    
    public void exibir() {
        // Define a janela como visível
        jogo.setVisible(true); 
    }
    public static void reiniciarJogo() {
        // Reinicialize o jogo como desejar
        // Por exemplo, recrie o JFrame e o Player
         // fecha a janela atual
        JFrame novoJogo = new JFrame(); // ou outra forma de criar o JFrame
        Player player = new Player("DefaultName", 1, new Mapa(1, null)); // ou outra forma de criar o Player
        novoJogo.add(player);
        novoJogo.setVisible(true);
        player.requestFocusInWindow();
    }

    // Método para atualizar a JanelaGameplay (chama o Player para atualizar)
    public void atualizar() {
        player.atualizar(); // Chama o método atualizar() do Player
    }
    
    public void atualizarTela() {
        jogo.repaint();
    }
}
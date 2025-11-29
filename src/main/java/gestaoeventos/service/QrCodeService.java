package gestaoeventos.service;

import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class QrCodeService {

    /**
     * Gera um URL de QR Code a partir de um conteúdo qualquer.
     * Usa o serviço público api.qrserver.com apenas para gerar a imagem.
     */
    public String gerarUrlQrCode(String conteudo) {
        String data = URLEncoder.encode(conteudo, StandardCharsets.UTF_8);
        // Podes alterar o size= se quiseres outra dimensão
        return "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=" + data;
    }
}


package poov.modelo;

public class Doador {
        private Long codigo;
        private String nome;
        private String cpf;
        private String contato;
        private boolean tipoERHCorretos;

        public Long getCodigo() {
            return codigo;
        }
        public void setCodigo(Long codigo) {
            this.codigo = codigo;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public String getContato() {
            return contato;
        }
        public void setContato(String contato) {
            this.contato = contato;
        }
        public boolean isTipoERHCorretos() {
            return tipoERHCorretos;
        }
        public void setTipoERHCorretos(boolean tipoERHCorretos) {
            this.tipoERHCorretos = tipoERHCorretos;
        }

        public RH getRh() {
            return RH.DESCONHECIDO;
        }

        public TipoSanguineo getTipoSanguineo() {
            return TipoSanguineo.DESCONHECIDO;
        }

        public TipoSanguineo setTipoSanguineo(TipoSanguineo tipoSanguineo) {
            return tipoSanguineo;
        }

        public RH setRh(RH rh) {
            return rh;
        }

        public Situacao getSituacao() {
            return Situacao.ATIVO;
        }

        public Situacao setSituacao(Situacao situacao) {
            return situacao;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
            result = prime * result + ((contato == null) ? 0 : contato.hashCode());
            result = prime * result + (tipoERHCorretos ? 1231 : 1237);
            return result;
        }
       
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Doador other = (Doador) obj;
            if (codigo == null) {
                if (other.codigo != null)
                    return false;
            } else if (!codigo.equals(other.codigo))
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (cpf == null) {
                if (other.cpf != null)
                    return false;
            } else if (!cpf.equals(other.cpf))
                return false;
            if (contato == null) {
                if (other.contato != null)
                    return false;
            } else if (!contato.equals(other.contato))
                return false;
            if (tipoERHCorretos != other.tipoERHCorretos)
                return false;
            return true;
        }
        
        @Override
        public String toString() {
            return "Doador [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", contato=" + contato
                    + ", tipoERHCorretos=" + tipoERHCorretos + "]";
        }

        

}

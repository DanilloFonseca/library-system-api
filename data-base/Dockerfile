# Usando a imagem oficial do PostgreSQL
FROM postgres:latest

# Definindo as variáveis de ambiente (usuário, senha e banco de dados)
ENV POSTGRES_USER=danillofonseca
ENV POSTGRES_PASSWORD=mysecretpassword
ENV POSTGRES_DB=library_api

# Copiando scripts SQL personalizados, se necessário (exemplo)
COPY ./backup.sql /docker-entrypoint-initdb.d/

# Expondo a porta padrão do PostgreSQL
EXPOSE 5432

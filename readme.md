# Belajar Docker

## Docker File
Docker file digunakan untuk mengkonfigurasi docker image.
doownload docker dan Install extension docker di vscode
### Langkah Pertama add docker files
```bash
ctrl + shift + p
```
pada vscode workspace ctrl+ shift + p : docker add files to workspace -> pilih bahasa java -> pilih port 8080 karena secara default spring boot adalah 8080 -> optional docker compose 

setelah itu akan terdapat 2 file yaitu .dockerIgnore dan dockerfile 

### Langkah Kedua lakukan configurasi di docker file

```python
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/coba-0.0.1-SNAPSHOT.jar coba.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar coba.jar
```
Menjadi seperti ini (Ini secara simple tetapi untuk kasus yg lain mungkin bisa lebih simple atau lebih rumit)
```python
FROM openjdk:21-jdk-alpine
WORKDIR /opt/app
COPY target/coba-0.0.1-SNAPSHOT.jar coba.jar
EXPOSE 8080
ENTRYPOINT exec java -jar coba.jar
```
° dimana From itu menunjukkan dimana kita menggunakan java versi berapa.
° WORKDIR menujukan direktori kerja untuk instruktsi RUN, CMD, ENTRYPOINT, COPY dan ADD.
```bash
mvn clean-install
```
° COPY jadi setelah  melakukan clean-install hasil compile coba-0.0.1-SNAPSHOT.jar dari forlder target itu nanti akan ditambahkan ke docker dengan nama coba.jar
° EXPOSE untuk membuka aplikasi di container docker dengan port yang telah ditentukan.
° ENTRYPOINT ketika dijalankan maka dia akan eksekusi perintah  (exec coba.jar).

### Langkah ketiga build dockerfile
1. Pada workspace lakukan klik kanan build image pada Dockerfile 
2. Kasih label version berapa 😁
3. Cek di bagian extension docker pada IMAGES 
4. Diklik namaImages -> klik kanan run version berapa
5. Kalau mau stop Diklik namaImages -> klik kanan stop version berapa

## Readminder
Problem: You cannot create a .jar after you change localhost to different value. 
Answer : 
```bash
mvn install -DskipTests=true
```
and press CTRL+ENTER, if you press only enter it will not work.
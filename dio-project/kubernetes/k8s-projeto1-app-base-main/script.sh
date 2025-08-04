#!/bin/bash

echo "Criando as imagens......."

docker build -t toinhoitacity/projeto-backend:1.0 backend/
docker build -t toinhoitacity/projeto-database:1.0 database/

echo "Realizando o push das imagens...."

docker push toinhoitacity/projeto-backend:1.0
docker push toinhoitacity/projeto-database:1.0

echo "Criando serviços no cluster kubernetes..."

kubectl apply -f ./services.yml

echo "Criando os deployments......"

kubectl apply -f ./deployment.yml
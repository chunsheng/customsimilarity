curl -XPUT localhost:9200/test  --data-binary @CreateIndex.txt
curl -XPUT localhost:9200/test_normal  --data-binary @CreateIndexNormal.txt

curl -XPUT localhost:9200/test/entry/1  --data-binary @Entry1.txt
curl -XPUT localhost:9200/test_normal/entry/1  --data-binary @Entry2.txt
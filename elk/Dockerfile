FROM sebp/elk:564

RUN bin/logstash-plugin install logstash-codec-json_lines
ADD ./logstash-springboot.conf /etc/logstash/conf.d/

EXPOSE 10000
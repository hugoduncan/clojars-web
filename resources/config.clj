{:db {:classname "org.sqlite.JDBC"
      :subprotocol "sqlite"
      :subname "data/db"}
 :key-file "data/authorized_keys"
 :repo "/home/clojars/repo"
 :bcrypt-work-factor 12
 :mail {:hostname "smtp.gmail.com"
        :from "noreply@clojars.org"
        :username "clojars@pupeno.com"
        :password "fuuuuuu"
        :port 465 ; If you change ssl to false, the port might not be effective, search for .setSSL and .setSslSmtpPort
        :ssl true}}

(ns reckhard.main
  (:require
   [compojure.core :refer [GET defroutes]]
   [compojure.route :as route]
   [ring.adapter.jetty :refer [run-jetty]]
   [ring.middleware.reload :refer [wrap-reload]]))

(use 'reckhard.core)

(defroutes app
  (GET "/programming" [] page-programming)
  (GET "/" [] page-index)
  (route/resources "/static")
  (route/not-found page-404))

(def reloadable-app
  (wrap-reload #'app))

(def system {})

(defn serve
  ([] (serve 8080))
  ([port] (def system (assoc system :server (run-jetty app {:port port, :join? false})))))

(defn end []
  (.stop (system :server))
  (def system (dissoc system :server)))

(defn -main [& args]
  (serve))

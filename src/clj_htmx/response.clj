(ns clj-htmx.response)

(def no-content {:status 204 :headers {} :body ""})
(def hx-refresh {:status 200 :headers {"HX-Refresh" "true"} :body ""})

(defn html-response [body]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body body})

(defn hx-redirect [redirect]
  {:status 200
   :headers {"HX-Redirect" redirect}
   :body ""})

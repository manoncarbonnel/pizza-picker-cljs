(ns pizza.picker
  (:require
   [reagent.core :as r]
   ["react-dom/client" :as rdom]))

(defonce root (r/atom nil))

(defn app []
  [:h1 "Pizza picker 🍕"])

(defn start
  {:dev/after-load true}
  []
  (let [root-el (js/document.getElementById "app")]
    (reset! root (rdom/createRoot root-el))
    (.render @root (r/as-element [app]))))

(defn main []
  (start)
  (js/console.log "Hello pizza lovers 🍕"))
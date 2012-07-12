(ns vb-banhammer.views.welcome
  (:require [vb-banhammer.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to vb-banhammer"]))

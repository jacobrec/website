(ns reckhard.core)
(use 'hiccup.page)
(def svg-github
  "<svg role=\"img\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><title>GitHub icon</title><path d=\"M12 .297c-6.63 0-12 5.373-12 12 0 5.303 3.438 9.8 8.205 11.385.6.113.82-.258.82-.577 0-.285-.01-1.04-.015-2.04-3.338.724-4.042-1.61-4.042-1.61C4.422 18.07 3.633 17.7 3.633 17.7c-1.087-.744.084-.729.084-.729 1.205.084 1.838 1.236 1.838 1.236 1.07 1.835 2.809 1.305 3.495.998.108-.776.417-1.305.76-1.605-2.665-.3-5.466-1.332-5.466-5.93 0-1.31.465-2.38 1.235-3.22-.135-.303-.54-1.523.105-3.176 0 0 1.005-.322 3.3 1.23.96-.267 1.98-.399 3-.405 1.02.006 2.04.138 3 .405 2.28-1.552 3.285-1.23 3.285-1.23.645 1.653.24 2.873.12 3.176.765.84 1.23 1.91 1.23 3.22 0 4.61-2.805 5.625-5.475 5.92.42.36.81 1.096.81 2.22 0 1.606-.015 2.896-.015 3.286 0 .315.21.69.825.57C20.565 22.092 24 17.592 24 12.297c0-6.627-5.373-12-12-12\"/></svg>")
(def svg-drop
  "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\"><path d=\"M24 0H0v24h24z\" fill=\"none\"/><path d=\"M17.66 7.93L12 2.27 6.34 7.93c-3.12 3.12-3.12 8.19 0 11.31C7.9 20.8 9.95 21.58 12 21.58c2.05 0 4.1-.78 5.66-2.34 3.12-3.12 3.12-8.19 0-11.31zM12 19.59c-1.6 0-3.11-.62-4.24-1.76C6.62 16.69 6 15.19 6 13.59s.62-3.11 1.76-4.24L12 5.1v14.49z\"/></svg>")

(def page-index
  (html5
   [:head
    [:meta {:name "viewport", :content "minimum-scale=1, width=device-width, initial-scale=1"}]
    (include-css "static/main.css")
    (include-js "static/main.js")]
   [:body.spread.ver
    [:div
     [:h1 "Jacob Reckhard"]
     [:h2 "Proper Noun. [ʤeɪ•kʌb rɛk•hɑrd]"]
     [:p "Someone who excels at programming. Usually enjoys long runs through the forest, nice rounds of frisbee golf, and hitting the climbing gym. An all around nice person"
      [:sup "1"]]
     [:p "See also: "
       [:a {:href "programming"} "Code Ninja"]]
     [:div.hor.drift
      [:div#butInvert.clickable.icon
        svg-drop]
      [:a.clickable.icon {:href "https://github.com/jacobrec"}
        svg-github]]]
    [:footer
     [:p "1. Ask my Mom!"]]]))

(def page-programming
  (html5
   [:head
    [:meta {:name "viewport", :content "width=device-width, initial-scale=1"}]
    (include-css "static/main.css")
    (include-js "static/main.js")]
   [:h1 "Programming"]
   [:p "It's my favorite pastime. I make all kinds of cool things from emulators, and virtual machines, to compilers and interpreters. I have a lot, so I'm just going to showcase my favorites."]
   [:div
     [:a.codelink {:href "https://github.com/jacobrec/dnes"} "DNES"]
     [:p "An NES emulator written in D. This is still a work in progress, but, it has a fully working CPU, that can boot NES roms."]]
   [:div
     [:a.codelink {:href "https://github.com/jacobrec/coldfire-emulator"} "Coldfire Emulator"]
     [:p "A coldfire emulator, and assembler. Coldfire is an old microprocessor, very similar to the Motorola 68K. This software will take assembly code, and run it as if it were a real coldfire device."]]
   [:div
     [:a.codelink {:href "http://github.com/jacobrec/junior"} "Junior"]
     [:p "My first attempt at building an interpreter. This is a simple tree walk interpreter for my own little programming language."]]))

(def page-404
  (html5
    [:p "404 Page not found"]))

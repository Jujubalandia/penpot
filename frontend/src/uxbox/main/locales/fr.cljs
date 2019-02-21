;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; Copyright (c) 2015-2016 Andrey Antukh <niwi@niwi.nz>
;; Copyright (c) 2015-2016 Juan de la Cruz <delacruzgarciajuan@gmail.com>

(ns uxbox.main.locales.en)

(defonce locales
  {"ds.projects" "PROJETS"
   "ds.num-projects" ["Nb projets"
                      "%s projet"
                      "%s projets"]
   "ds.project-title" "Vos projets"
   "ds.project-new" "+ Nouveau projet"

   "ds.ordering" "Trier par"
   "ds.ordering.by-name" "nom"
   "ds.ordering.by-last-update" "dernière mise à jour"
   "ds.ordering.by-creation-date" "date de création"
   "ds.search.placeholder" "Rechercher..."
   "ds.uploaded-at" "Mise en ligne : %s"

   "ds.confirm-title" "Êtes-vous sûr ?"
   "ds.confirm-ok" "Ok"
   "ds.confirm-cancel" "Annuler"

   "ds.multiselect-bar.copy" "Copier"
   "ds.multiselect-bar.copy-to-library" "Copier vers la librairie"
   "ds.multiselect-bar.move" "Déplacer"
   "ds.multiselect-bar.move-to-library" "Déplacer vers la librairie"
   "ds.multiselect-bar.rename" "Renommer"
   "ds.multiselect-bar.delete" "Supprimer"

   "ds.elements" "ÉLÉMENTS"
   "ds.num-elements" ["%s élément"
                      "%s éléments"]

   "ds.icons" "ICÔNES"
   "ds.num-icons" ["Nb icônes"
                   "%s icône"
                   "%s icônes"]
   "ds.your-icons-title" "VOS ICÔNES"
   "ds.store-icons-title" "BOUTIQUE"
   "ds.icons-collection.new" "+ Nouvelle collection"
   "ds.icon.new" "+ Nouvel icône"

   "ds.images" "IMAGES"
   "ds.num-images" ["Nb images"
                    "%s image"
                    "%s images"]
   "ds.your-images-title" "VOS IMAGES"
   "ds.store-images-title" "BOUTIQUE"
   "ds.images-collection.new" "+ Nouvelle librairie"
   "ds.image-new" "+ New image"

   "ds.colors" "COULEURS"
   "ds.num-colors" ["Nb couleurs"
                    "%s couleur"
                    "%s couleurs"]
   "ds.your-colors-title" "YOUR COLORS"
   "ds.store-colors-title" "BOUTIQUE"
   "ds.colors-collection.new" "+ Nouvelle librairie"
   "ds.color-new" "+ Nouvelle color"
   "ds.color-lightbox.title" "Nouvelle couleur"
   "ds.color-lightbox.add" "+ Ajouter couleur"

   "ds.library-title" "Librairie : "
   "ds.standard-title" "STANDARD"
   "ds.your-libraries-title" "VOS LIBRAIRIES"

   "ds.recent-colors" "Couleurs récentes"
   "ds.element-options" "Options d'élément"
   "ds.draw-tools" "Outils de dessin"
   "ds.sitemap" "Plan du site"
   "ds.document-history" "Historique du document"

   "ds.help.rect" "Boîte (Ctrl + B)"
   "ds.help.circle" "Cercle (Ctrl + E)"
   "ds.help.line" "Ligne (Ctrl + L)"
   "ds.help.text" "Texte"
   "ds.help.path" "Chemin"
   "ds.help.curve" "Courbe"
   "ds.help.ruler" "Règle"

   "ds.user.profile" "Profil"
   "ds.user.password" "Mot de passe"
   "ds.user.notifications" "Notifications"
   "ds.user.exit" "Quitter"

   "auth.message.recovery-token-sent" "Password recovery link sent to your inbox."
   "auth.message.password-recovered" "Password successfully recovered."

   "settings.profile" "PROFIL"
   "settings.password" "MOT DE PASSE"
   "settings.notifications" "NOTIFICATIONS"
   "settings.profile-saved" "Profil enregistré avec succès !"
   "settings.password-saved" "Mot de passe enregistré avec succès !"
   "settings.wrong-old-password" "Ancien mot de passe incorrect"
   "settings.change-password" "Changement de mot de passe"
   "settings.old-password" "Ancien mot de passe"
   "settings.new-password" "Nouveau mot de passe"
   "settings.confirm-password" "Confirmez mot de passe"
   "settings.update-settings" "Mettre à jour les paramètres"

   "history.alert-message" "Vous voyez la version %s"
   "errors.api.form.old-password-not-match" "Ancien mot de passe incorrect"
   "errors.api.form.registration-disabled" "L'enregistrement est actuellement désactivé."
   "errors.api.form.email-already-exists" "L'email est déjà utilisé par un autre utilisateur."
   "errors.api.form.username-already-exists" "Le nom d'utilisateur est déjà utilisé par un autre utilisateur."
   "errors.api.form.user-not-exists" "Le nom d'utilisateur ou l'e-mail ne correspond à aucun utilisateur existant."
   "errors.form.required" "Ce champ est obligatoire"
   "errors.form.string" "Devrait être une chaîne de caractères"
   "errors.form.number" "Nombre invalide"
   "errors.form.integer" "Entier invalide"
   "errors.form.bool" "Devrait être un booléen"
   "errors.form.min-len" "Devrait être supérieur à %s"
   "errors.form.max-len" "Devrait être inférieur à %s"
   "errors.form.color" "Devrait être une couleur valide"
   "errors.form.password-not-match" "Le mot de passe ne correspond pas"
   "errors.auth.unauthorized" "Le nom d'utilisateur ou le mot de passe semble être faux."
   "errors.auth.invalid-recovery-token" "Le jeton de récupération n'est pas valide."
   "errors.profile.update-password" "Erreur lors de la mise à jour du mot de passe, votre ancien mot de passe est probablement incorrect."

   "errors.network" "Impossible de se connecter au serveur principal."
   "errors.generic" "Quelque chose c'est mal passé."
   "errors.conflict" "Conflit sur la sauvegarde des données, actualisez et réessayez."})

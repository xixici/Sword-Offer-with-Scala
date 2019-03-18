emoji=( ♈️ :aries: ♉️ :taurus:	♊️ :gemini:	♋️ :cancer: ♌️ :leo:	♍️ :virgo:	♎️ :libra: ♏️ :scorpius:	♐️ :sagittarius: ♑️ :capricorn:
♒️ :aquarius:	♓️ :pisces:	⛎ :ophiuchus: 🔯 :six_pointed_star: )


git add -A
echo "Add Finish"
git commit -am "xixici ${emoji[$(($RANDOM % ${#emoji[@]} + 1 ))]} push at $(date "+%Y-%m-%d %H:%M:%S")"
echo "Commit Finish"
git pull
echo "Pull Finish"
git status
echo "Status Finish"
git push
echo "push Finish"

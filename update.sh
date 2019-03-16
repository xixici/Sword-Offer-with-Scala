git add -A
echo "Add Finish"
git commit -am "$(date "+%Y-%m-%d %H:%M:%S")"
echo "Commit Finish"
git pull
echo "Pull Finish"
git status
echo "Status Finish"
git push
echo "push Finish"

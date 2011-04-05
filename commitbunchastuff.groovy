def rand = new Random()
def randNum = rand.nextInt(101)
def str = "fixed a bug with the media content not wanting to shape the circle properly like the square was shaped working on unit test for class that seemed difficult"
def strs = str.split(' ')
def randStr = "10"
(0..10).each {
    randStr += strs[rand.nextInt(strs.length)]
}
new File("commitbunchastuff.groovy").text << "QC-$randNum: $randStr" 
"git status".execute()
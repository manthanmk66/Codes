db.emp.aggregate({
    $match: {
        job: "manager"
    }
}, {
	$project:{
    _id: false,
    ename: true,
    sal: true,
    job: true
	x: {
        $add: ['$sal', 1000]
    }
}})
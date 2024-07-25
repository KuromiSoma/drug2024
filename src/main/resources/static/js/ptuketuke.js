(function() {
  'use strict';

  /*
    今日の日付データを変数todayに格納
   */
  var optionLoop, this_day, this_month, this_year, today;
  today = new Date();
  this_year = today.getFullYear();
  this_month = today.getMonth() + 1;
  this_day = today.getDate();

  /*
    ループ処理（スタート数字、終了数字、表示id名、デフォルト数字）
   */
  optionLoop = function(start, end, id, this_day) {
    var i, opt;
    opt = null;
    for (i = start; i <= end ; i++) {
      if (i === this_day) {
        opt += "＜option value='" + i + "' selected>" + i + "＜/option>";
      } else {
        opt += "＜option value='" + i + "'>" + i + "＜/option>";
      }
    }
    return document.getElementById(id).innerHTML = opt;
  };


  /*
    関数設定（スタート数字[必須]、終了数字[必須]、表示id名[省略可能]、デフォルト数字[省略可能]）
   */
  //生年月日
  optionLoop(1950, this_year, 'birthdayDtYear', this_year);
  optionLoop(1, 12, 'birthdayDtMonth', this_month);
  optionLoop(1, 31, 'birthdayDtDay', this_day);

  //有効期限
  optionLoop(this_year, this_year+10, 'expDtYear', this_year);
  optionLoop(1, 12, 'expDtMonth', this_month);
  optionLoop(1, 31, 'expDtDay', this_day);

  //受付日
  optionLoop(this_year-5, this_year+5, 'receiptDtYear', this_year);
  optionLoop(1, 12, 'receiptDtMonth', this_month);
  optionLoop(1, 31, 'receiptDtDay', this_day);

  //電話番号（数字のみ）（JQuery）
  $('#nkTel').on("keypress", function(event){return leaveOnlyNumber(event);});

  function leaveOnlyNumber(e){
	// 数字以外の不要な文字を削除
	var st = String.fromCharCode(e.which);
	if ("0123456789".indexOf(st,0) < 0) { return false; }
	return true;
  }

})();
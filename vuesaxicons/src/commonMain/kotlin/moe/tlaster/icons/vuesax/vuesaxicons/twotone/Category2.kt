package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Category2: ImageVector
    get() {
        if (_category2 != null) {
            return _category2!!
        }
        _category2 = Builder(name = "Category2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                horizontalLineTo(19.0f)
                curveTo(21.0f, 10.0f, 22.0f, 9.0f, 22.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(15.0f, 2.0f, 14.0f, 3.0f, 14.0f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(14.0f, 9.0f, 15.0f, 10.0f, 17.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(9.0f, 22.0f, 10.0f, 21.0f, 10.0f, 19.0f)
                verticalLineTo(17.0f)
                curveTo(10.0f, 15.0f, 9.0f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.0f, 14.0f, 2.0f, 15.0f, 2.0f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                curveTo(8.2091f, 10.0f, 10.0f, 8.2091f, 10.0f, 6.0f)
                curveTo(10.0f, 3.7909f, 8.2091f, 2.0f, 6.0f, 2.0f)
                curveTo(3.7909f, 2.0f, 2.0f, 3.7909f, 2.0f, 6.0f)
                curveTo(2.0f, 8.2091f, 3.7909f, 10.0f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                curveTo(20.2091f, 22.0f, 22.0f, 20.2091f, 22.0f, 18.0f)
                curveTo(22.0f, 15.7909f, 20.2091f, 14.0f, 18.0f, 14.0f)
                curveTo(15.7909f, 14.0f, 14.0f, 15.7909f, 14.0f, 18.0f)
                curveTo(14.0f, 20.2091f, 15.7909f, 22.0f, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _category2!!
    }

private var _category2: ImageVector? = null

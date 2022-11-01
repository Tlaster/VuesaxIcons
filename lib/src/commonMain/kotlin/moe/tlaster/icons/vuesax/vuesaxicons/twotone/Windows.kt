package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.0f, 2.0f)
                lineTo(12.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.0f, 22.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 4.2998f)
                lineTo(2.0f, 5.9998f)
                verticalLineTo(10.9998f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.2998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 19.7f)
                lineTo(2.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.7f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null

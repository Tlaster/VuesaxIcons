package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Chart1: ImageVector
    get() {
        if (_chart1 != null) {
            return _chart1!!
        }
        _chart1 = Builder(name = "Chart1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.25f)
                verticalLineTo(4.0f)
                curveTo(14.25f, 2.9f, 13.8f, 2.0f, 12.45f, 2.0f)
                horizontalLineTo(11.55f)
                curveTo(10.2f, 2.0f, 9.75f, 2.9f, 9.75f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 8.9f, 6.6f, 8.0f, 5.4f, 8.0f)
                horizontalLineTo(4.6f)
                curveTo(3.4f, 8.0f, 3.0f, 8.9f, 3.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 13.9f, 20.6f, 13.0f, 19.4f, 13.0f)
                horizontalLineTo(18.6f)
                curveTo(17.4f, 13.0f, 17.0f, 13.9f, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _chart1!!
    }

private var _chart1: ImageVector? = null

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

public val LinearGroup.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(name = "Calculator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(19.0f, 22.0f, 21.0f, 20.0f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 4.0f, 19.0f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(5.0f, 2.0f, 3.0f, 4.0f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 20.0f, 5.0f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 7.58f)
                verticalLineTo(8.58f)
                curveTo(16.5f, 9.4f, 15.83f, 10.08f, 15.0f, 10.08f)
                horizontalLineTo(9.0f)
                curveTo(8.18f, 10.08f, 7.5f, 9.41f, 7.5f, 8.58f)
                verticalLineTo(7.58f)
                curveTo(7.5f, 6.76f, 8.17f, 6.08f, 9.0f, 6.08f)
                horizontalLineTo(15.0f)
                curveTo(15.83f, 6.08f, 16.5f, 6.75f, 16.5f, 7.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1361f, 14.0f)
                horizontalLineTo(8.1477f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9952f, 14.0f)
                horizontalLineTo(12.0068f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8544f, 14.0f)
                horizontalLineTo(15.8659f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1361f, 17.5f)
                horizontalLineTo(8.1477f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9952f, 17.5f)
                horizontalLineTo(12.0068f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8544f, 17.5f)
                horizontalLineTo(15.8659f)
            }
        }
        .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null

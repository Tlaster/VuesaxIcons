package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Baghappy: ImageVector
    get() {
        if (_baghappy != null) {
            return _baghappy!!
        }
        _baghappy = Builder(name = "Baghappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3398f, 15.28f)
                curveTo(15.4398f, 14.95f, 15.4998f, 14.61f, 15.4998f, 14.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 14.25f)
                curveTo(8.5f, 16.17f, 10.08f, 17.75f, 12.0f, 17.75f)
                curveTo(12.36f, 17.75f, 12.71f, 17.69f, 13.04f, 17.59f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.8095f, 2.0f)
                lineTo(5.1894f, 5.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.1895f, 2.0f)
                lineTo(18.8095f, 5.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.8501f)
                curveTo(2.0f, 6.0001f, 2.99f, 5.8501f, 4.22f, 5.8501f)
                horizontalLineTo(19.78f)
                curveTo(21.01f, 5.8501f, 22.0f, 6.0001f, 22.0f, 7.8501f)
                curveTo(22.0f, 10.0001f, 21.01f, 9.8501f, 19.78f, 9.8501f)
                horizontalLineTo(4.22f)
                curveTo(2.99f, 9.8501f, 2.0f, 10.0001f, 2.0f, 7.8501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9102f, 18.64f)
                curveTo(5.2302f, 20.58f, 6.0002f, 22.0f, 8.8602f, 22.0f)
                horizontalLineTo(14.8902f)
                curveTo(18.0002f, 22.0f, 18.4602f, 20.64f, 18.8202f, 18.76f)
                lineTo(20.5002f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 10.0f)
                lineTo(4.19f, 14.25f)
            }
        }
        .build()
        return _baghappy!!
    }

private var _baghappy: ImageVector? = null

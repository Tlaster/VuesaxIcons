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

public val TwotoneGroup.Clock1: ImageVector
    get() {
        if (_clock1 != null) {
            return _clock1!!
        }
        _clock1 = Builder(name = "Clock1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.6602f)
                verticalLineTo(12.4502f)
                lineTo(13.4f, 13.8502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                curveTo(5.5f, 8.41f, 8.41f, 5.5f, 12.0f, 5.5f)
                curveTo(15.59f, 5.5f, 18.5f, 8.41f, 18.5f, 12.0f)
                curveTo(18.5f, 14.08f, 17.52f, 15.94f, 16.0f, 17.13f)
                horizontalLineTo(15.99f)
                curveTo(14.89f, 17.99f, 13.51f, 18.5f, 12.0f, 18.5f)
                curveTo(10.51f, 18.5f, 9.14f, 18.0f, 8.04f, 17.15f)
                horizontalLineTo(8.03f)
                curveTo(6.49f, 15.96f, 5.5f, 14.1f, 5.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0303f, 17.1499f)
                horizontalLineTo(8.0403f)
                curveTo(9.1403f, 17.9999f, 10.5103f, 18.4999f, 12.0003f, 18.4999f)
                curveTo(13.5103f, 18.4999f, 14.8903f, 17.9899f, 15.9903f, 17.1299f)
                horizontalLineTo(16.0003f)
                lineTo(15.4903f, 19.5999f)
                curveTo(15.0003f, 21.4999f, 13.9003f, 21.9999f, 12.5503f, 21.9999f)
                horizontalLineTo(11.4603f)
                curveTo(10.1103f, 21.9999f, 9.0003f, 21.4999f, 8.5203f, 19.5899f)
                lineTo(8.0303f, 17.1499f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0303f, 6.85f)
                horizontalLineTo(8.0403f)
                curveTo(9.1403f, 6.0f, 10.5103f, 5.5f, 12.0003f, 5.5f)
                curveTo(13.5103f, 5.5f, 14.8903f, 6.01f, 15.9903f, 6.87f)
                horizontalLineTo(16.0003f)
                lineTo(15.4903f, 4.4f)
                curveTo(15.0003f, 2.5f, 13.9003f, 2.0f, 12.5503f, 2.0f)
                horizontalLineTo(11.4603f)
                curveTo(10.1103f, 2.0f, 9.0003f, 2.5f, 8.5203f, 4.41f)
                lineTo(8.0303f, 6.85f)
                close()
            }
        }
        .build()
        return _clock1!!
    }

private var _clock1: ImageVector? = null

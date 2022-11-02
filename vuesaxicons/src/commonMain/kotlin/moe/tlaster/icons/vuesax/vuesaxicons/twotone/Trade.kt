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

public val TwotoneGroup.Trade: ImageVector
    get() {
        if (_trade != null) {
            return _trade!!
        }
        _trade = Builder(name = "Trade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 12.09f, 19.09f, 15.0f, 15.5f, 15.0f)
                curveTo(15.33f, 15.0f, 15.15f, 14.99f, 14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(9.01f, 8.85f, 9.0f, 8.67f, 9.0f, 8.5f)
                curveTo(9.0f, 4.91f, 11.91f, 2.0f, 15.5f, 2.0f)
                curveTo(19.09f, 2.0f, 22.0f, 4.91f, 22.0f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.5f)
                curveTo(15.0f, 19.09f, 12.09f, 22.0f, 8.5f, 22.0f)
                curveTo(4.91f, 22.0f, 2.0f, 19.09f, 2.0f, 15.5f)
                curveTo(2.0f, 11.91f, 4.91f, 9.0f, 8.5f, 9.0f)
                curveTo(8.67f, 9.0f, 8.85f, 9.01f, 9.02f, 9.02f)
                curveTo(12.19f, 9.27f, 14.73f, 11.81f, 14.98f, 14.98f)
                curveTo(14.99f, 15.15f, 15.0f, 15.33f, 15.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.59f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 2.0f, 2.0f, 2.45f, 2.0f, 3.0f)
                verticalLineTo(5.59f)
                curveTo(2.0f, 6.48f, 3.08f, 6.93f, 3.71f, 6.3f)
                lineTo(6.3f, 3.71f)
                curveTo(6.92f, 3.08f, 6.48f, 2.0f, 5.59f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4097f, 22.0003f)
                horizontalLineTo(20.9997f)
                curveTo(21.5497f, 22.0003f, 21.9997f, 21.5503f, 21.9997f, 21.0003f)
                verticalLineTo(18.4103f)
                curveTo(21.9997f, 17.5203f, 20.9197f, 17.0703f, 20.2897f, 17.7003f)
                lineTo(17.6997f, 20.2903f)
                curveTo(17.0797f, 20.9203f, 17.5197f, 22.0003f, 18.4097f, 22.0003f)
                close()
            }
        }
        .build()
        return _trade!!
    }

private var _trade: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Solana: ImageVector
    get() {
        if (_solana != null) {
            return _solana!!
        }
        _solana = Builder(name = "Solana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0002f, 3.5f)
                horizontalLineTo(5.5002f)
                curveTo(5.1902f, 3.5f, 4.8902f, 3.65f, 4.7002f, 3.9f)
                lineTo(3.2002f, 5.9f)
                curveTo(2.7102f, 6.56f, 3.1802f, 7.5f, 4.0002f, 7.5f)
                horizontalLineTo(18.5002f)
                curveTo(18.8102f, 7.5f, 19.1102f, 7.35f, 19.3002f, 7.1f)
                lineTo(20.8002f, 5.1f)
                curveTo(21.2902f, 4.44f, 20.8202f, 3.5f, 20.0002f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0002f, 10.0f)
                horizontalLineTo(18.5002f)
                curveTo(18.8102f, 10.0f, 19.1102f, 10.15f, 19.3002f, 10.4f)
                lineTo(20.8002f, 12.4f)
                curveTo(21.2902f, 13.06f, 20.8202f, 14.0f, 20.0002f, 14.0f)
                horizontalLineTo(5.5002f)
                curveTo(5.1902f, 14.0f, 4.8902f, 13.85f, 4.7002f, 13.6f)
                lineTo(3.2002f, 11.6f)
                curveTo(2.7102f, 10.94f, 3.1802f, 10.0f, 4.0002f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0002f, 16.5f)
                horizontalLineTo(5.5002f)
                curveTo(5.1902f, 16.5f, 4.8902f, 16.65f, 4.7002f, 16.9f)
                lineTo(3.2002f, 18.9f)
                curveTo(2.7102f, 19.56f, 3.1802f, 20.5f, 4.0002f, 20.5f)
                horizontalLineTo(18.5002f)
                curveTo(18.8102f, 20.5f, 19.1102f, 20.35f, 19.3002f, 20.1f)
                lineTo(20.8002f, 18.1f)
                curveTo(21.2902f, 17.44f, 20.8202f, 16.5f, 20.0002f, 16.5f)
                close()
            }
        }
        .build()
        return _solana!!
    }

private var _solana: ImageVector? = null

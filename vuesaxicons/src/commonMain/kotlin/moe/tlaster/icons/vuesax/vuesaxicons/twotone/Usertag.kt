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

public val TwotoneGroup.Usertag: ImageVector
    get() {
        if (_usertag != null) {
            return _usertag!!
        }
        _usertag = Builder(name = "Usertag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.8597f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.8597f, 15.68f, 19.1697f, 15.12f, 19.7297f)
                lineTo(13.41f, 21.4197f)
                curveTo(12.63f, 22.1897f, 11.36f, 22.1897f, 10.58f, 21.4197f)
                lineTo(8.87f, 19.7297f)
                curveTo(8.31f, 19.1697f, 7.54f, 18.8597f, 6.75f, 18.8597f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.8597f, 3.0f, 17.5298f, 3.0f, 15.8898f)
                verticalLineTo(4.9797f)
                curveTo(3.0f, 3.3397f, 4.34f, 2.0098f, 6.0f, 2.0098f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0098f, 21.0f, 3.3397f, 21.0f, 4.9797f)
                verticalLineTo(15.8898f)
                curveTo(21.0f, 17.5198f, 19.66f, 18.8597f, 18.0f, 18.8597f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 9.9998f)
                curveTo(13.2868f, 9.9998f, 14.33f, 8.9566f, 14.33f, 7.6698f)
                curveTo(14.33f, 6.383f, 13.2868f, 5.3398f, 11.9999f, 5.3398f)
                curveTo(10.7131f, 5.3398f, 9.6699f, 6.383f, 9.6699f, 7.6698f)
                curveTo(9.6699f, 8.9566f, 10.7131f, 9.9998f, 11.9999f, 9.9998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.6599f)
                curveTo(16.0f, 13.8599f, 14.21f, 12.3999f, 12.0f, 12.3999f)
                curveTo(9.79f, 12.3999f, 8.0f, 13.8599f, 8.0f, 15.6599f)
            }
        }
        .build()
        return _usertag!!
    }

private var _usertag: ImageVector? = null

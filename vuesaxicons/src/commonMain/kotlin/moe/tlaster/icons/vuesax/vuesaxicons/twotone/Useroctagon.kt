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

public val TwotoneGroup.Useroctagon: ImageVector
    get() {
        if (_useroctagon != null) {
            return _useroctagon!!
        }
        _useroctagon = Builder(name = "Useroctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0802f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.0802f, 16.54f, 20.4802f, 17.58f, 19.5102f, 18.15f)
                lineTo(13.5702f, 21.58f)
                curveTo(12.6002f, 22.14f, 11.4002f, 22.14f, 10.4202f, 21.58f)
                lineTo(4.4802f, 18.15f)
                curveTo(3.5102f, 17.59f, 2.9102f, 16.55f, 2.9102f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.9102f, 7.46f, 3.5102f, 6.42f, 4.4802f, 5.85f)
                lineTo(10.4202f, 2.42f)
                curveTo(11.3902f, 1.86f, 12.5902f, 1.86f, 13.5702f, 2.42f)
                lineTo(19.5102f, 5.85f)
                curveTo(20.4802f, 6.42f, 21.0802f, 7.45f, 21.0802f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 10.9998f)
                curveTo(13.2867f, 10.9998f, 14.3299f, 9.9566f, 14.3299f, 8.6698f)
                curveTo(14.3299f, 7.383f, 13.2867f, 6.3398f, 11.9999f, 6.3398f)
                curveTo(10.7131f, 6.3398f, 9.6699f, 7.383f, 9.6699f, 8.6698f)
                curveTo(9.6699f, 9.9566f, 10.7131f, 10.9998f, 11.9999f, 10.9998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.6599f)
                curveTo(16.0f, 14.8599f, 14.21f, 13.3999f, 12.0f, 13.3999f)
                curveTo(9.79f, 13.3999f, 8.0f, 14.8599f, 8.0f, 16.6599f)
            }
        }
        .build()
        return _useroctagon!!
    }

private var _useroctagon: ImageVector? = null

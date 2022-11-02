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

public val TwotoneGroup.Walletsearch: ImageVector
    get() {
        if (_walletsearch != null) {
            return _walletsearch!!
        }
        _walletsearch = Builder(name = "Walletsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 9.3f, 20.3f, 7.3f, 17.8f, 7.0f)
                curveTo(17.6f, 7.0f, 17.3f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7f, 7.0f, 6.5f, 7.0f, 6.2f, 7.1f)
                curveTo(3.6f, 7.4f, 2.0f, 9.3f, 2.0f, 12.0f)
                curveTo(2.0f, 12.3f, 2.0f, 12.7f, 2.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7992f, 7.0002f)
                curveTo(17.5992f, 7.0002f, 17.2992f, 7.0002f, 16.9992f, 7.0002f)
                horizontalLineTo(6.9992f)
                curveTo(6.6992f, 7.0002f, 6.4992f, 7.0002f, 6.1992f, 7.1002f)
                curveTo(6.2992f, 6.8002f, 6.4992f, 6.6002f, 6.7992f, 6.3002f)
                lineTo(9.9992f, 3.0002f)
                curveTo(11.3992f, 1.6002f, 13.5992f, 1.6002f, 14.9992f, 3.0002f)
                lineTo(16.7992f, 4.8002f)
                curveTo(17.3992f, 5.4002f, 17.6992f, 6.2002f, 17.7992f, 7.0002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 12.5f, 17.0f, 13.4f, 17.0f, 14.5f)
                curveTo(17.0f, 15.6f, 17.9f, 16.5f, 19.0f, 16.5f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7996f, 21.4f)
                curveTo(7.5696f, 21.4f, 8.9996f, 19.97f, 8.9996f, 18.2f)
                curveTo(8.9996f, 16.43f, 7.5696f, 15.0f, 5.7996f, 15.0f)
                curveTo(4.0296f, 15.0f, 2.5996f, 16.43f, 2.5996f, 18.2f)
                curveTo(2.5996f, 19.97f, 4.0296f, 21.4f, 5.7996f, 21.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(3.0f, 21.0f)
            }
        }
        .build()
        return _walletsearch!!
    }

private var _walletsearch: ImageVector? = null

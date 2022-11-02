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

public val TwotoneGroup.Lockcircle: ImageVector
    get() {
        if (_lockcircle != null) {
            return _lockcircle!!
        }
        _lockcircle = Builder(name = "Lockcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.34f, 9.5f, 7.0f, 12.0f, 7.0f)
                curveTo(14.5f, 7.0f, 15.0f, 8.34f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 14.5999f)
                curveTo(12.3317f, 14.5999f, 12.6003f, 14.3313f, 12.6003f, 13.9999f)
                curveTo(12.6003f, 13.6685f, 12.3317f, 13.3999f, 12.0004f, 13.3999f)
                curveTo(11.669f, 13.3999f, 11.4004f, 13.6685f, 11.4004f, 13.9999f)
                curveTo(11.4004f, 14.3313f, 11.669f, 14.5999f, 12.0004f, 14.5999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 17.0f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 17.0f, 7.0f, 16.5f, 7.0f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(7.0f, 11.5f, 7.5f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(16.5f, 11.0f, 17.0f, 11.5f, 17.0f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 16.5f, 16.5f, 17.0f, 14.5f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _lockcircle!!
    }

private var _lockcircle: ImageVector? = null

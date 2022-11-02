package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Fingercricle: ImageVector
    get() {
        if (_fingercricle != null) {
            return _fingercricle!!
        }
        _fingercricle = Builder(name = "Fingercricle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9996f, 14.8799f)
                curveTo(11.0896f, 14.8799f, 10.3496f, 14.1399f, 10.3496f, 13.2299f)
                verticalLineTo(10.7599f)
                curveTo(10.3496f, 9.8499f, 11.0896f, 9.1099f, 11.9996f, 9.1099f)
                curveTo(12.9096f, 9.1099f, 13.6496f, 9.8499f, 13.6496f, 10.7599f)
                verticalLineTo(13.2299f)
                curveTo(13.6496f, 14.1399f, 12.9096f, 14.8799f, 11.9996f, 14.8799f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.98f, 13.4702f)
                curveTo(16.78f, 16.0502f, 14.62f, 18.0702f, 12.0f, 18.0702f)
                curveTo(9.24f, 18.0702f, 7.0f, 15.8302f, 7.0f, 13.0702f)
                verticalLineTo(10.9302f)
                curveTo(7.0f, 8.1702f, 9.24f, 5.9302f, 12.0f, 5.9302f)
                curveTo(14.59f, 5.9302f, 16.72f, 7.9002f, 16.97f, 10.4202f)
            }
        }
        .build()
        return _fingercricle!!
    }

private var _fingercricle: ImageVector? = null

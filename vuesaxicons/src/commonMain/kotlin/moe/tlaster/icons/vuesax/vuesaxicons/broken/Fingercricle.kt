package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Fingercricle: ImageVector
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
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9996f, 9.12f)
                curveTo(12.9096f, 9.12f, 13.6496f, 9.86f, 13.6496f, 10.77f)
                verticalLineTo(13.24f)
                curveTo(13.6496f, 14.15f, 12.9096f, 14.89f, 11.9996f, 14.89f)
                curveTo(11.0896f, 14.89f, 10.3496f, 14.15f, 10.3496f, 13.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.98f, 13.4699f)
                curveTo(16.78f, 16.0499f, 14.62f, 18.0699f, 12.0f, 18.0699f)
                curveTo(9.24f, 18.0699f, 7.0f, 15.8299f, 7.0f, 13.0699f)
                verticalLineTo(10.9299f)
                curveTo(7.0f, 8.1699f, 9.24f, 5.9299f, 12.0f, 5.9299f)
                curveTo(14.59f, 5.9299f, 16.72f, 7.8999f, 16.97f, 10.4199f)
            }
        }
        .build()
        return _fingercricle!!
    }

private var _fingercricle: ImageVector? = null

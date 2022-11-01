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

public val BrokenGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 6.0f, 8.0f, 6.9f, 8.0f, 8.0f)
                curveTo(8.0f, 9.1f, 8.9f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 10.0f, 8.0f, 10.9f, 8.0f, 12.0f)
                curveTo(8.0f, 13.1f, 8.9f, 14.0f, 10.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 14.0f, 8.0f, 14.9f, 8.0f, 16.0f)
                curveTo(8.0f, 17.1f, 8.9f, 18.0f, 10.0f, 18.0f)
                curveTo(11.1f, 18.0f, 12.0f, 17.1f, 12.0f, 16.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1f, 6.0f, 16.0f, 6.9f, 16.0f, 8.0f)
                curveTo(16.0f, 9.1f, 15.1f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                curveTo(15.1f, 10.0f, 16.0f, 10.9f, 16.0f, 12.0f)
                curveTo(16.0f, 13.1f, 15.1f, 14.0f, 14.0f, 14.0f)
                curveTo(12.9f, 14.0f, 12.0f, 13.1f, 12.0f, 12.0f)
                curveTo(12.0f, 10.9f, 12.9f, 10.0f, 14.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null

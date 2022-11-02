package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Zel: ImageVector
    get() {
        if (_zel != null) {
            return _zel!!
        }
        _zel = Builder(name = "Zel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 11.46f)
                verticalLineTo(14.31f)
                lineTo(8.0f, 15.75f)
                lineTo(5.5f, 14.31f)
                verticalLineTo(11.46f)
                lineTo(8.0f, 10.02f)
                lineTo(9.25f, 10.74f)
                lineTo(10.5f, 11.46f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 11.46f)
                verticalLineTo(14.31f)
                lineTo(16.0f, 15.75f)
                lineTo(13.5f, 14.31f)
                verticalLineTo(11.46f)
                lineTo(14.75f, 10.74f)
                lineTo(16.0f, 10.02f)
                lineTo(18.5f, 11.46f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.75f, 9.33f)
                verticalLineTo(10.74f)
                lineTo(13.5f, 11.46f)
                verticalLineTo(13.19f)
                lineTo(12.0f, 14.05f)
                lineTo(10.5f, 13.19f)
                verticalLineTo(11.46f)
                lineTo(9.25f, 10.74f)
                verticalLineTo(9.33f)
                lineTo(12.0f, 7.75f)
                lineTo(14.75f, 9.33f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _zel!!
    }

private var _zel: ImageVector? = null

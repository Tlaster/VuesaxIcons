package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Card-coin`: ImageVector
    get() {
        if (`_card-coin` != null) {
            return `_card-coin`!!
        }
        `_card-coin` = Builder(name = "Card-coin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.7f)
                verticalLineTo(15.81f)
                curveTo(12.0f, 16.09f, 11.78f, 16.31f, 11.5f, 16.31f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 16.31f, 2.0f, 16.09f, 2.0f, 15.81f)
                verticalLineTo(15.7f)
                curveTo(2.0f, 13.94f, 2.44f, 13.5f, 4.22f, 13.5f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 13.5f, 12.0f, 13.94f, 12.0f, 15.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 17.3086f)
                curveTo(2.22f, 17.3086f, 2.0f, 17.5286f, 2.0f, 17.8086f)
                verticalLineTo(18.8086f)
                verticalLineTo(19.7986f)
                curveTo(2.0f, 21.5586f, 2.44f, 21.9986f, 4.22f, 21.9986f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 21.9986f, 12.0f, 21.5586f, 12.0f, 19.7986f)
                verticalLineTo(18.8086f)
                verticalLineTo(17.8086f)
                curveTo(12.0f, 17.5286f, 11.78f, 17.3086f, 11.5f, 17.3086f)
                horizontalLineTo(2.5f)
                verticalLineTo(17.3086f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 18.87f, 18.87f, 22.0f, 15.0f, 22.0f)
                lineTo(16.05f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                lineTo(7.95f, 3.75f)
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveTo(20.9853f, 11.0f, 23.0f, 8.9853f, 23.0f, 6.5f)
                curveTo(23.0f, 4.0147f, 20.9853f, 2.0f, 18.5f, 2.0f)
                curveTo(16.0147f, 2.0f, 14.0f, 4.0147f, 14.0f, 6.5f)
                curveTo(14.0f, 8.9853f, 16.0147f, 11.0f, 18.5f, 11.0f)
                close()
            }
        }
        .build()
        return `_card-coin`!!
    }

private var `_card-coin`: ImageVector? = null

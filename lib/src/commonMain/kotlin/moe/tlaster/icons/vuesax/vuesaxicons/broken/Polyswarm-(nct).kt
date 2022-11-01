package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Polyswarm-(nct)`: ImageVector
    get() {
        if (`_polyswarm-(nct)` != null) {
            return `_polyswarm-(nct)`!!
        }
        `_polyswarm-(nct)` = Builder(name = "Polyswarm-(nct)", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.72f, 14.8999f)
                curveTo(18.44f, 16.3399f, 16.57f, 17.2499f, 14.5f, 17.2499f)
                horizontalLineTo(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 3.25f)
                horizontalLineTo(14.5f)
                curveTo(18.35f, 3.25f, 21.5f, 6.4f, 21.5f, 10.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1699f, 6.75f)
                horizontalLineTo(13.8099f)
                curveTo(15.8399f, 6.75f, 17.4999f, 8.41f, 17.4999f, 10.44f)
                curveTo(17.4999f, 12.47f, 15.8399f, 14.13f, 13.8099f, 14.13f)
                horizontalLineTo(7.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 10.75f)
                horizontalLineTo(5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 20.75f)
                horizontalLineTo(2.5f)
            }
        }
        .build()
        return `_polyswarm-(nct)`!!
    }

private var `_polyswarm-(nct)`: ImageVector? = null

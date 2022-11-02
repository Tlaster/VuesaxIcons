package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.08f)
                verticalLineTo(6.25f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                verticalLineTo(3.25f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 3.25f, 1.25f, 4.59f, 1.25f, 9.0f)
                verticalLineTo(9.5f)
                curveTo(1.25f, 9.91f, 1.59f, 10.25f, 2.0f, 10.25f)
                curveTo(2.96f, 10.25f, 3.75f, 11.04f, 3.75f, 12.0f)
                curveTo(3.75f, 12.96f, 2.96f, 13.75f, 2.0f, 13.75f)
                curveTo(1.59f, 13.75f, 1.25f, 14.09f, 1.25f, 14.5f)
                verticalLineTo(15.0f)
                curveTo(1.25f, 19.41f, 2.59f, 20.75f, 7.0f, 20.75f)
                horizontalLineTo(9.25f)
                verticalLineTo(18.5f)
                curveTo(9.25f, 18.09f, 9.59f, 17.75f, 10.0f, 17.75f)
                verticalLineTo(14.92f)
                curveTo(9.59f, 14.92f, 9.25f, 14.58f, 9.25f, 14.17f)
                verticalLineTo(9.83f)
                curveTo(9.25f, 9.42f, 9.59f, 9.08f, 10.0f, 9.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 12.5f)
                curveTo(20.25f, 13.46f, 21.04f, 14.25f, 22.0f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15.0f)
                curveTo(22.75f, 19.41f, 21.41f, 20.75f, 17.0f, 20.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(18.5f)
                curveTo(10.75f, 18.09f, 10.41f, 17.75f, 10.0f, 17.75f)
                verticalLineTo(14.92f)
                curveTo(10.41f, 14.92f, 10.75f, 14.58f, 10.75f, 14.17f)
                verticalLineTo(9.83f)
                curveTo(10.75f, 9.42f, 10.41f, 9.08f, 10.0f, 9.08f)
                verticalLineTo(6.25f)
                curveTo(10.41f, 6.25f, 10.75f, 5.91f, 10.75f, 5.5f)
                verticalLineTo(3.25f)
                horizontalLineTo(17.0f)
                curveTo(21.41f, 3.25f, 22.75f, 4.59f, 22.75f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 10.41f, 22.41f, 10.75f, 22.0f, 10.75f)
                curveTo(21.04f, 10.75f, 20.25f, 11.54f, 20.25f, 12.5f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(1.25f, 10.59f, 2.59f, 9.25f, 7.0f, 9.25f)
                horizontalLineTo(17.0f)
                curveTo(21.41f, 9.25f, 22.75f, 10.59f, 22.75f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17.0f, 22.75f)
                close()
                moveTo(7.0f, 10.75f)
                curveTo(3.42f, 10.75f, 2.75f, 11.43f, 2.75f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(20.58f, 21.25f, 21.25f, 20.57f, 21.25f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(21.25f, 11.43f, 20.58f, 10.75f, 17.0f, 10.75f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.75f)
                curveTo(5.59f, 10.75f, 5.25f, 10.41f, 5.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(5.25f, 5.1f, 5.95f, 1.25f, 12.0f, 1.25f)
                curveTo(16.48f, 1.25f, 18.75f, 3.18f, 18.75f, 7.0f)
                curveTo(18.75f, 7.41f, 18.41f, 7.75f, 18.0f, 7.75f)
                curveTo(17.59f, 7.75f, 17.25f, 7.41f, 17.25f, 7.0f)
                curveTo(17.25f, 5.02f, 16.65f, 2.75f, 12.0f, 2.75f)
                curveTo(7.64f, 2.75f, 6.75f, 4.85f, 6.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(6.75f, 10.41f, 6.41f, 10.75f, 6.0f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.25f)
                curveTo(10.21f, 19.25f, 8.75f, 17.79f, 8.75f, 16.0f)
                curveTo(8.75f, 14.21f, 10.21f, 12.75f, 12.0f, 12.75f)
                curveTo(13.79f, 12.75f, 15.25f, 14.21f, 15.25f, 16.0f)
                curveTo(15.25f, 17.79f, 13.79f, 19.25f, 12.0f, 19.25f)
                close()
                moveTo(12.0f, 14.25f)
                curveTo(11.04f, 14.25f, 10.25f, 15.04f, 10.25f, 16.0f)
                curveTo(10.25f, 16.96f, 11.04f, 17.75f, 12.0f, 17.75f)
                curveTo(12.96f, 17.75f, 13.75f, 16.96f, 13.75f, 16.0f)
                curveTo(13.75f, 15.04f, 12.96f, 14.25f, 12.0f, 14.25f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null

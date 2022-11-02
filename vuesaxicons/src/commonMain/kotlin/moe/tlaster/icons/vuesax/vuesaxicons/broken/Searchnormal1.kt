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

public val BrokenGroup.Searchnormal1: ImageVector
    get() {
        if (_searchnormal1 != null) {
            return _searchnormal1!!
        }
        _searchnormal1 = Builder(name = "Searchnormal1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(16.75f, 2.0f, 21.0f, 6.25f, 21.0f, 11.5f)
                curveTo(21.0f, 16.75f, 16.75f, 21.0f, 11.5f, 21.0f)
                curveTo(6.25f, 21.0f, 2.0f, 16.75f, 2.0f, 11.5f)
                curveTo(2.0f, 7.8f, 4.11f, 4.6f, 7.2f, 3.03f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(20.0f, 20.0f)
            }
        }
        .build()
        return _searchnormal1!!
    }

private var _searchnormal1: ImageVector? = null
